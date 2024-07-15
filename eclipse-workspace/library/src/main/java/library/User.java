package library;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
private String name;
@Id
private String email;
private String Phoneno;
@Override
public String toString() {
	return this.name+""+this.email+""+this.Phoneno;
}

private String password;
	public User(String name, String email, String phoneno, String password) {
	super();
	this.name = name;
	this.email = email;
	Phoneno = phoneno;
	this.password = password;
}

	public User() {
		super();// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneno() {
		return Phoneno;
	}

	public void setPhoneno(String phoneno) {
		Phoneno = phoneno;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
