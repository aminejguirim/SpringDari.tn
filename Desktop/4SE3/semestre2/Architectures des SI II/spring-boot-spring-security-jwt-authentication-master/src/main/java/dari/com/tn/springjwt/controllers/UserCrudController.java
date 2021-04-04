package dari.com.tn.springjwt.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import dari.com.tn.springjwt.models.User;
import dari.com.tn.springjwt.security.services.UserCrudService;


@RestController
public class UserCrudController {
	
		@Autowired
		UserCrudService service;
		
		// http://localhost:4029/SpringMVC/servlet/add-user
		
				@PostMapping("/add-user")
				@ResponseBody
				public User addUser(@RequestBody User u) {
				User user = service.addUser(u);
				return user;
				}
				// http://localhost:4029/SpringMVC/servlet/retrieve-all-users
				@GetMapping("/retrieve-all-users")
				@ResponseBody
				public List<User> getUsers() {
				List<User> list = service.retrieveAllUsers();
				return list;
				
				}
				// http://localhost:4023/SpringMVC/servlet/modify-user
				@PutMapping(value = "/modify-user")
				@ResponseBody
				public User modifyUser(@RequestBody User user) {
				return service.updateUser(user);
				}
				// http://localhost:4023/SpringMVC/servlet/remove-user/{user-id}
				@DeleteMapping("/remove-user/{user-id}")
				@ResponseBody
				public void removeUser(@PathVariable("user-id") Long userId) {
				service.deleteUser(userId);
				}	
				
				@GetMapping("/retrieve-user/{user-id}") 
				@ResponseBody 
				 public User retrieveUser(@PathVariable("user-id") String userId) { 
					 return service.retrieveUser(userId); 
					 } 
		
	}
