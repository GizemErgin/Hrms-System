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
@Table(name="systemstaffs")
@Data
@EqualsAndHashCode(callSuper=false)

public class SystemStaff extends User{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="id")
	private int id;
	
	@Column(name="nationalId")
	private int nationalId;
	
	@Column(name="firstName")
	private String firstName;
	
	@Column(name="lastName")
	private String lastName;

}
