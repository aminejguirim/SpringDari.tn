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

import dari.com.tn.springjwt.models.SubPaiementDetails;
import dari.com.tn.springjwt.security.services.SubPaiementDetailsServiceImp;


@RestController
public class SubPaiementDetailsController {
	
@Autowired	
SubPaiementDetailsServiceImp sds ;
SubPaiementDetails subdet ;

@PostMapping("/subscriptiondetail/add")
public SubPaiementDetails saveSubPaiementDetails(@RequestBody SubPaiementDetails subdet){
	return sds.addSubDetails(subdet) ;
}
@GetMapping("/subscriptiondetails/all")
public ResponseEntity<List<SubPaiementDetails>> getAllSubscriptionDetails() {
	List<SubPaiementDetails> subdets = sds.listAll() ;
	return new ResponseEntity<>(subdets , HttpStatus.OK);
}
@DeleteMapping("/subpaiement/delete/{cardNum}")
public String deleteSubPaiement(@PathVariable Long cardNum){
	return sds.delete(cardNum);
}

}