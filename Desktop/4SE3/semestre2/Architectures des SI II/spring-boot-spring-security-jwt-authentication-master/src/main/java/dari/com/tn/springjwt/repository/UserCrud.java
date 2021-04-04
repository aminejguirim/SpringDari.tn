package dari.com.tn.springjwt.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import dari.com.tn.springjwt.models.User;



public interface UserCrud extends CrudRepository<User, Long> {

	@Query(nativeQuery = true, value ="SELECT count(*) FROM achat a where a.payementmode=\"USER\"")
    public int count1();
	@Query(nativeQuery = true, value ="select count(*) FROM achat a where a.payementmode=\"ADMIN\"")
    public int count2();
	
}
