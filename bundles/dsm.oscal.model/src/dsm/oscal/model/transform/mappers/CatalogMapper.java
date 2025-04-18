package dsm.oscal.model.transform.mappers;

import dsm.oscal.model.OscalCatalog.Catalog;
import dsm.oscal.model.OscalCatalog.OscalCatalogFactory;
import dsm.oscal.model.transform.MigrationUtils;

public class CatalogMapper extends AbstractObjectMapper<Catalog, gov.nist.secauto.oscal.lib.model.Catalog> {

	private CatalogMapper() {
	}

	/** Holder */
	private static class SingletonHolder {

		private final static CatalogMapper instance = new CatalogMapper();
	}

	/** Get unique instance of CatalogMapper */
	public static CatalogMapper getInstance() {
		return SingletonHolder.instance;
	}

	@Override
	protected Catalog safeToTrades(gov.nist.secauto.oscal.lib.model.Catalog oscalObject) {

		Catalog result = OscalCatalogFactory.eINSTANCE.createCatalog();

		MigrationUtils.setUUID(oscalObject.getUuid(), result);

		buildChildList(ControlMapper.getInstance(), oscalObject.getControls(), result::getControls);
		buildChildList(GroupMapper.getInstance(), oscalObject.getGroups(), result::getGroups);
		buildChildList(ParameterMapper.getInstance(), oscalObject.getParams(), result::getParams);

		result.setBackMatter(BackMatterMapper.getInstance().toTrades(oscalObject.getBackMatter()));
		result.setMetadata(MetadataMapper.getInstance().toTrades(oscalObject.getMetadata()));
		return result;
	}

	@Override
	protected gov.nist.secauto.oscal.lib.model.Catalog safeToOscal(Catalog tradesObject) {

		gov.nist.secauto.oscal.lib.model.Catalog result = new gov.nist.secauto.oscal.lib.model.Catalog();

		result.setUuid(tradesObject.getUuid());

		buildXMLChildList(ControlMapper.getInstance(), tradesObject.getControls(), result::setControls);
		buildXMLChildList(GroupMapper.getInstance(), tradesObject.getGroups(), result::setGroups);
		buildXMLChildList(ParameterMapper.getInstance(), tradesObject.getParams(), result::setParams);

		result.setBackMatter(BackMatterMapper.getInstance().toOscal(tradesObject.getBackMatter()));
		result.setMetadata(MetadataMapper.getInstance().toOscal(tradesObject.getMetadata()));

		return result;
	}

}
