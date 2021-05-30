package kodlamaio.hrms.entities.abstracts;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="users")
@Data
@Inheritance(strategy = InheritanceType.JOINED)


public abstract class user {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="userId")
	private int userId;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	@Column(name="password_repaet")
	private String password_repaet;
	
	@Column(name="email_verification")
	private boolean email_verification;
	
}
