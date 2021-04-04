package dari.com.tn.springjwt.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import dari.com.tn.springjwt.models.Property;
import dari.com.tn.springjwt.security.services.IPropertyService;

@RestController
public class PropertyRestController {

	@Autowired
	IPropertyService propService;

	// http://localhost:6000/SpringMVC/servlet/retrieve-all-prop
	@RequestMapping(value = "/retrieve-all-prop",method = RequestMethod.GET)
	@ResponseBody
	public List<Property> getAdss() {
	List<Property> list = propService.retrieveAllProp();
	return list;
	
	}
	
	// http://localhost:6000/SpringMVC/servlet/retrieve-prop/{prop-id}
	@RequestMapping(value = "/retrieve-prop/{prop-id}",method = RequestMethod.GET)
	@ResponseBody
	public Property retrieveUser(@PathVariable("prop-id") String propId) {
	return propService.retrieveProp(propId);
	}

	// http://localhost:6000/SpringMVC/servlet/add-prop
	@RequestMapping(value = "/add-prop",method = RequestMethod.POST)
	@ResponseBody
	public Property addProp(@RequestBody Property p) {
	Property prop = propService.addProp(p);
	return prop;
	}
	
	// http://localhost:6000/SpringMVC/servlet/remove-prop/{prop-id}
	@RequestMapping(value = "/remove-prop/{prop-id}",method = RequestMethod.DELETE)
	@ResponseBody
	public void removeUser(@PathVariable("prop-id") Long propId) {
	propService.deleteProp(propId);;
	}

	// http://localhost:6000/SpringMVC/servlet/modify-user
	//@RequestMapping(value = "/modify-user",method = RequestMethod.PUT)
	//@ResponseBody
	//public Property modifyUser(@RequestBody Property prop) {
	//return propService.updateProp(prop);
	}


