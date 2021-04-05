package dari.com.tn.springjwt.security.services;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dari.com.tn.springjwt.models.Subscription;
import dari.com.tn.springjwt.repository.SubscriptionRepository;

;

@Service
public class SubscriptionServiceImp implements ISubscriptionService {

	@Autowired
SubscriptionRepository sr ;
Subscription subscription ;

private static final Logger L = LogManager.getLogger(SubscriptionServiceImp.class) ;

public List<Subscription> listAll() {
	return sr.findAll() ;
}
public void save(Subscription subscription) {
	sr.save(subscription) ;
}
public Subscription addSubscription(Subscription subscription){
	return sr.save(subscription) ;
}
public String delete(Long idClient) {
	sr.deleteById(idClient);
	return "Subscription removed" ; 
}
}