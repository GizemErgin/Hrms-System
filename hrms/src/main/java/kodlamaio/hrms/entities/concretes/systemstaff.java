package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import kodlamaio.hrms.entities.abstracts.user;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name="systemstaffs")
@Data
@EqualsAndHashCode(callSuper=false)

public class systemstaff extends user{

	@Id
	@GeneratedValue
	
	@Column(name="id")
	private int id;
	
	@Column(name="nationalId")
	private int nationalId;
	
	@Column(name="firstName")
	private String firstName;
	
	@Column(name="lastName")
	private String lastName;

}
