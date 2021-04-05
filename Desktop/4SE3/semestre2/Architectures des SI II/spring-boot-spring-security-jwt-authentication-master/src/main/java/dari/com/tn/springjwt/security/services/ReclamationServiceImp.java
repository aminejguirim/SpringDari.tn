package dari.com.tn.springjwt.security.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dari.com.tn.springjwt.models.Reclamation;
import dari.com.tn.springjwt.repository.Reclamationrepository;



@Service
public class ReclamationServiceImp implements IReclamationService {
	
	@Autowired
	Reclamationrepository reclamationrepository;
	
	public Reclamation saveReclamation(Reclamation reclamation)		{
	return reclamationrepository.save(reclamation);
	
	}
	
	public List<Reclamation> saveReclamations(List<Reclamation> reclamations) {
		return reclamationrepository.saveAll(reclamations) ;
			
		
	}
	
	public List<Reclamation> getReclamations() {
		return reclamationrepository.findAll();
	
	}
	
	public String deleteReclamations(Long idRec)
	{
		reclamationrepository.deleteById(idRec);
		return "reclamation removed" ;
		
	}
}
