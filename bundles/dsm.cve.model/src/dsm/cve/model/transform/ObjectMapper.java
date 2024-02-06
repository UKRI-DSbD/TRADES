package dsm.cve.model.transform;

import org.eclipse.emf.ecore.EObject;

public interface ObjectMapper<T extends EObject, U> {

	T toTrades(U cveObject);

	U toCVE(T tradesObject);


}
