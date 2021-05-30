package kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import kodlamaio.hrms.entities.abstracts.user;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name="jobseekers")
@Data
@EqualsAndHashCode(callSuper=false)

public class jobseeker extends user{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="id")
	private int id;
	
	@Column(name="jobTitleId")
	private int jobTitleId;
	
	@Column(name="firstName")
	private String firstName;
	
	@Column(name="lastName")
	private String lastName;
	
	@Column(name="nationalId")
	private String nationalId;
	
	@Column(name="birthday")
	private LocalDate birthday;
	
}
