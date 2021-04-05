package dari.com.tn.springjwt.security.services;

import java.util.List;
import java.util.UUID;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dari.com.tn.springjwt.models.Client;
import dari.com.tn.springjwt.models.User;
import dari.com.tn.springjwt.repository.ClientRepository;



@Service
public class ClientServiceImp implements IClientService {

	@Autowired
	ClientRepository cr ;
	Client client ;
	private static final Logger L = LogManager.getLogger(ClientServiceImp.class) ;
	
	
	public Client addClient(Client client){
		return cr.save(client) ;
	}
	
	public List<Client> listAll() {
		return cr.findAll() ;
	}
	
	public void save(Client client) {
		cr.save(client) ;
	}
	
	public Client get(Long idClient) {
		return cr.findById(idClient).get();
	}
	
	public Client updateClient(Client client) {
		Client existingClient = cr.findById(client.getIdClient()).orElse(null);
		return cr.save(existingClient) ;
	}
	public String delete(Long idClient) {
		cr.deleteById(idClient);
		return "client removed" ; 
	}

	@Override
	public Client retrieveClient(String id) {
		// TODO Auto-generated method stub
		return (Client) cr.findAll();
	}

	@Override
	public void update(Long idClient, Client client) {
		// TODO Auto-generated method stub
		
	}
	
}