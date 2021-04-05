package dari.com.tn.springjwt.security.services;

import dari.com.tn.springjwt.models.SubPaiementDetails;

public interface ISubPaiementDetails {

	public void save(SubPaiementDetails subdet);
	public SubPaiementDetails addSubDetails(SubPaiementDetails subdet);
	public String delete(Long cardNum) ;
}
