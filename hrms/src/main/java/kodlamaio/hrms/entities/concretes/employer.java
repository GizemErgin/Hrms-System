package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import kodlamaio.hrms.entities.abstracts.user;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name="employers")
@Data
@EqualsAndHashCode(callSuper=false)

public class employer extends user{
	
	@Id
	@GeneratedValue
	
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
