package dari.com.tn.springjwt.security.services;

import java.util.List;

import dari.com.tn.springjwt.models.User;



public interface UserCrudService {

	
	List<User> retrieveAllUsers();

	User addUser(User u);
	
	void deleteUser(Long id);
	
	User updateUser(User u);
	
	User retrieveUser(String id);
	
	void deleteUserById(long id);
	
	public int getNombreUSERJPQL();
	public int getNombreADMINJPQL();
}
