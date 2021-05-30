package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import kodlamaio.hrms.entities.abstracts.User;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name="employers")
@Data
@EqualsAndHashCode(callSuper=false)

public class Employer extends User{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="id")
	private int id;
	
	@Column(name="companyName")
	private String companyName;
	
	@Column(name="phoneNumber")
	private String phoneNumber;
	
	@Column(name="website")
	private String website;
	
	@Column(name="hrms_verification")
	private boolean hrms_verification;
	
}
