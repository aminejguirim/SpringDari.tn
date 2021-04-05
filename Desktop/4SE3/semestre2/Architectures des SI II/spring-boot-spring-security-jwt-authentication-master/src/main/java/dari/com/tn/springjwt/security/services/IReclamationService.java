package dari.com.tn.springjwt.security.services;

import dari.com.tn.springjwt.models.Reclamation;

public interface IReclamationService {
	public Reclamation saveReclamation(Reclamation reclamation) ;
	public String deleteReclamations(Long idRec) ;
}
