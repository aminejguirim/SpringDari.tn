package dari.com.tn.springjwt.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="T_CLIENT")
public class Client implements Serializable  {
	private static final long serialVersionUID = 1L;
	@Column(name="ID_CLIENT")
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
private Long idClient ;
	@OneToMany(cascade=CascadeType.ALL,mappedBy="client")
	private List<Subscription> subscription;
	private String firstname;
	private String lastname;
	private String adresse;
	private String mail;
	private String job;
	private int age;
	private int phonenumber;
	

public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}
public Long getIdClient() {
	return idClient;
}
public void setIdClient(Long idClient) {
	this.idClient = idClient;
}
}
