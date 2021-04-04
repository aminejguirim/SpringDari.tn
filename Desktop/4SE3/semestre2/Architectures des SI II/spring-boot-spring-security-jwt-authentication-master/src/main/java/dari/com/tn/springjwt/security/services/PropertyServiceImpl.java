package dari.com.tn.springjwt.security.services;

import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dari.com.tn.springjwt.models.Property;
import dari.com.tn.springjwt.repository.PropertyRepository;

@Service
public class PropertyServiceImpl implements IPropertyService {

	
	@Autowired
	PropertyRepository propRepository;
	private static final Logger L =LogManager.getLogger(PropertyServiceImpl.class);
	
	
	
	@Override
	public List<Property> retrieveAllProp() {
		List<Property> props = (List<Property>) propRepository.findAll();
		for (Property prop : props) {
			L.info(" prop : " + prop);
		}
		
		return props;
	}

	@Override
	public Property addProp(Property p) {	
		return propRepository.save(p);
	}
	
	

	/*@Override
	public void deleteUser(String id) {
		userRepository.findById(Long.parseLong(id));
		
	}*/

	
	@Override
	public void deleteProp(Long id) {
		propRepository.deleteById(id);
	}
	
	@Override
	public Property updateProp(Property p) {
		return propRepository.save(p);
	}
	@Override
	public Property retrieveProp(String id) {
		Property p = propRepository.findById(Long.parseLong(id)).orElse(null);
		return p;
	}
	
}
