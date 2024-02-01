package dsm.cwe.model.transform;

import org.eclipse.emf.ecore.EObject;

public interface ObjectMapper<T extends EObject, U> {

	T toTrades(U cweObject);

	U toCWE(T tradesObject);


}
