package dari.com.tn.springjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dari.com.tn.springjwt.models.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client , Long>{

}
