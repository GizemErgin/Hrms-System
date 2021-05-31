package kodlamaio.hrms.entities.abstracts;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="users")
@Data
@Inheritance(strategy = InheritanceType.JOINED)
@NoArgsConstructor
@AllArgsConstructor


public abstract class User {

	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	@Column(name="user_id")
	private int userId;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	@Column(name="password_repeat")
	private String password_repeat;
	
	@Column(name="email_verification")
	private boolean email_verification;
	
}
