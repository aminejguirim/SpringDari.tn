package dari.com.tn.springjwt.security.services;

import java.util.List;

import dari.com.tn.springjwt.models.Property;

public interface IPropertyService {

	List<Property> retrieveAllProp();
	Property addProp(Property p);
	void deleteProp(Long id);
	Property updateProp(Property p);
	Property retrieveProp(String id);
	
}
