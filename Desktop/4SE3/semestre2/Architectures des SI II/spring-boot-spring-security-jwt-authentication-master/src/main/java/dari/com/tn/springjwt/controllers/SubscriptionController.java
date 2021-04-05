package dari.com.tn.springjwt.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import dari.com.tn.springjwt.models.Subscription;
import dari.com.tn.springjwt.security.services.SubscriptionServiceImp;



@RestController
public class SubscriptionController {
	@Autowired
	SubscriptionServiceImp ss;
	
	@GetMapping("/subscriptions")
	public ResponseEntity<List<Subscription>> getAllSubscriptions() {
		List<Subscription> subscriptions = ss.listAll() ;
		return new ResponseEntity<>(subscriptions , HttpStatus.OK);
	}
	@PostMapping("/subscription/add")
	public Subscription saveSubscription(@RequestBody Subscription subscription){
		return ss.addSubscription(subscription) ;
	}
	@DeleteMapping("/subscription/delete/{idClient}")
	public String deleteSubscription(@PathVariable Long idClient){
		return ss.delete(idClient);
	}

}