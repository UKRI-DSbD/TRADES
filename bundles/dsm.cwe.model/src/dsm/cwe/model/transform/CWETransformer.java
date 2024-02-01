/**
 * 
 *  Copyright Israel Aerospace Industries, Eclipse contributors and others 2021. All rights reserved.
 *  This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License 2.0
 *  which accompanies this distribution, and is available at
 *  https://www.eclipse.org/legal/epl-2.0/
 *  
 *  SPDX-License-Identifier: EPL-2.0
 *  
 *  Contributors:
 *      ELTA Ltd - initial API and implementation
 *  
 * 
 */
package dsm.cwe.model.transform;

import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.file.Path;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import dsm.cwe.model.CWECatalog.CWECatalogFactory;
import dsm.cwe.model.CWECatalog.Categories;
import dsm.cwe.model.CWECatalog.Category;
import dsm.cwe.model.CWECatalog.ExternalReference;
import dsm.cwe.model.CWECatalog.ExternalReferences;
import dsm.cwe.model.CWECatalog.View;
import dsm.cwe.model.CWECatalog.Views;
import dsm.cwe.model.CWECatalog.Weakness;
import dsm.cwe.model.CWECatalog.WeaknessCatalog;
import dsm.cwe.model.CWECatalog.Weaknesses;

/**
 * Transformer in charge of importing CWE catalog
 */
public class CWETransformer {

	/**
	 * Imports the catalog located at the given path
	 * 
	 * @param path the xml file path
	 * @return a {@link Catalog} or <code>null</code> if invalid definition
	 */
	public WeaknessCatalog importWeaknessCatalog(Path path) {
		if (path == null || !path.toFile().isFile()) {
			throw new IllegalArgumentException("Invalid input file");
		}

		CWECatalogFactory catalogFactory = CWECatalogFactory.eINSTANCE;
		WeaknessCatalog weaknessCatalog = catalogFactory.createWeaknessCatalog();

		extractVersion(path, catalogFactory, weaknessCatalog);
		extractWeaknesses(path, catalogFactory, weaknessCatalog);
		extractCategories(path, catalogFactory, weaknessCatalog);
		extractViews(path, catalogFactory, weaknessCatalog);
		extractExternalReferences(path, catalogFactory, weaknessCatalog);
		
		return weaknessCatalog;
	}

	private void extractVersion(Path path, CWECatalogFactory catalogFactory, WeaknessCatalog weaknessCatalog) {
		DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
		documentFactory.setIgnoringElementContentWhitespace(true);

		try (InputStream input = new FileInputStream(path.toString())) {
			DocumentBuilder builder = documentFactory.newDocumentBuilder();
			Document doc = builder.parse(input);

			Node weaknessCatalogNode = doc.getDocumentElement();
			String version = weaknessCatalogNode.getAttributes().getNamedItem("Version").getNodeValue();
			weaknessCatalog.setVersion(version);
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}

	private void extractWeaknesses(Path path, CWECatalogFactory catalogFactory, WeaknessCatalog weaknessCatalog) {
		Weaknesses weaknesses = catalogFactory.createWeaknesses();
		DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
		documentFactory.setIgnoringElementContentWhitespace(true);

		try (InputStream input = new FileInputStream(path.toString())) {
			DocumentBuilder builder = documentFactory.newDocumentBuilder();
			Document doc = builder.parse(input);

			Node weaknessCatalogNode = doc.getDocumentElement();
			NodeList weaknessCatalogChildList = weaknessCatalogNode.getChildNodes();
			for (int i = 0; i < weaknessCatalogChildList.getLength(); i++) {
				Node weaknessCatalogChild = weaknessCatalogChildList.item(i);
				if (weaknessCatalogChild.getNodeName() == "Weaknesses") {
					NodeList weaknessesNodeList = weaknessCatalogChild.getChildNodes();
					for (int j = 0; j < weaknessesNodeList.getLength(); j++) {
						Node weaknessNode = weaknessesNodeList.item(j);
						if(weaknessNode.getNodeType() != Node.TEXT_NODE) {
							String iD = weaknessNode.getAttributes().getNamedItem("ID").getNodeValue();
							String name = weaknessNode.getAttributes().getNamedItem("Name").getNodeValue();
							String abstraction = weaknessNode.getAttributes().getNamedItem("Abstraction").getNodeValue();
							String structure = weaknessNode.getAttributes().getNamedItem("Structure").getNodeValue();
							String status = weaknessNode.getAttributes().getNamedItem("Status").getNodeValue();
							Weakness weakness = catalogFactory.createWeakness();
							weakness.setID(iD);
							weakness.setValue(name);
							weakness.setAbstraction(abstraction);
							weakness.setStructure(structure);
							weakness.setStatus(status);
							weaknesses.getWeaknesses().add(weakness);
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		weaknessCatalog.setWeaknesses(weaknesses);
	}

	private void extractCategories(Path path, CWECatalogFactory catalogFactory, WeaknessCatalog weaknessCatalog) {
		Categories categories = catalogFactory.createCategories();
		DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
		documentFactory.setIgnoringElementContentWhitespace(true);

		try (InputStream input = new FileInputStream(path.toString())) {
			DocumentBuilder builder = documentFactory.newDocumentBuilder();
			Document doc = builder.parse(input);

			Node weaknessCatalogNode = doc.getDocumentElement();
			NodeList weaknessCatalogChildList = weaknessCatalogNode.getChildNodes();
			for (int i = 0; i < weaknessCatalogChildList.getLength(); i++) {
				Node weaknessCatalogChild = weaknessCatalogChildList.item(i);
				if (weaknessCatalogChild.getNodeName() == "Categories") {
					NodeList categoriesNodeList = weaknessCatalogChild.getChildNodes();
					for (int j = 0; j < categoriesNodeList.getLength(); j++) {
						Node categoryNode = categoriesNodeList.item(j);
						if(categoryNode.getNodeType() != Node.TEXT_NODE) {
							String iD = categoryNode.getAttributes().getNamedItem("ID").getNodeValue();
							String name = categoryNode.getAttributes().getNamedItem("Name").getNodeValue();
							String status = categoryNode.getAttributes().getNamedItem("Status").getNodeValue();
							Category category = catalogFactory.createCategory();
							category.setID(iD);
							category.setName(name);
							category.setStatus(status);
							categories.getCategories().add(category);
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		weaknessCatalog.setCategories(categories);
	}

	private void extractViews(Path path, CWECatalogFactory catalogFactory, WeaknessCatalog weaknessCatalog) {
		Views views = catalogFactory.createViews();
		DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
		documentFactory.setIgnoringElementContentWhitespace(true);

		try (InputStream input = new FileInputStream(path.toString())) {
			DocumentBuilder builder = documentFactory.newDocumentBuilder();
			Document doc = builder.parse(input);

			Node weaknessCatalogNode = doc.getDocumentElement();
			NodeList weaknessCatalogChildList = weaknessCatalogNode.getChildNodes();
			for (int i = 0; i < weaknessCatalogChildList.getLength(); i++) {
				Node weaknessCatalogChild = weaknessCatalogChildList.item(i);
				if (weaknessCatalogChild.getNodeName() == "Views") {
					NodeList viewsNodeList = weaknessCatalogChild.getChildNodes();
					for (int j = 0; j < viewsNodeList.getLength(); j++) {
						Node viewNode = viewsNodeList.item(j);
						if(viewNode.getNodeType() != Node.TEXT_NODE) {
							String iD = viewNode.getAttributes().getNamedItem("ID").getNodeValue();
							String name = viewNode.getAttributes().getNamedItem("Name").getNodeValue();
							String type = viewNode.getAttributes().getNamedItem("Type").getNodeValue();
							String status = viewNode.getAttributes().getNamedItem("Status").getNodeValue();
							View view = catalogFactory.createView();
							view.setID(iD);
							view.setName(name);
							view.setType(type);
							view.setStatus(status);
							views.getViews().add(view);
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		weaknessCatalog.setViews(views);
	}

	private void extractExternalReferences(Path path, CWECatalogFactory catalogFactory, WeaknessCatalog weaknessCatalog) {
		ExternalReferences externalReferences = catalogFactory.createExternalReferences();
		DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
		documentFactory.setIgnoringElementContentWhitespace(true);

		try (InputStream input = new FileInputStream(path.toString())) {
			DocumentBuilder builder = documentFactory.newDocumentBuilder();
			Document doc = builder.parse(input);

			Node weaknessCatalogNode = doc.getDocumentElement();
			NodeList weaknessCatalogChildList = weaknessCatalogNode.getChildNodes();
			for (int i = 0; i < weaknessCatalogChildList.getLength(); i++) {
				Node weaknessCatalogChild = weaknessCatalogChildList.item(i);
				if (weaknessCatalogChild.getNodeName() == "External_References") {
					NodeList externalReferencesNodeList = weaknessCatalogChild.getChildNodes();
					for (int j = 0; j < externalReferencesNodeList.getLength(); j++) {
						Node externalReferenceNode = externalReferencesNodeList.item(j);
						if(externalReferenceNode.getNodeType() != Node.TEXT_NODE) {
							String referenceID = externalReferenceNode.getAttributes().getNamedItem("Reference_ID").getNodeValue();
							ExternalReference externalReference = catalogFactory.createExternalReference();
							externalReference.setReferenceID(referenceID);
							externalReferences.getExternalReferences().add(externalReference);
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		weaknessCatalog.setExternalReferences(externalReferences);
	}
}
