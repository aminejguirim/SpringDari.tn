package dari.com.tn.springjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dari.com.tn.springjwt.models.Subscription;

@Repository
public interface SubscriptionRepository extends JpaRepository<Subscription , Long> {

}
