package dari.com.tn.springjwt.security.services;

import java.util.List;

import dari.com.tn.springjwt.models.Subscription;

public interface ISubscriptionService {
	
	public List<Subscription> listAll() ;
	public void save(Subscription subscription);
	public Subscription addSubscription(Subscription subscription);
	public String delete(Long idClient) ;
}
