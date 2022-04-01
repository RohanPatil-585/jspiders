package mavenHibernate.mavenHibernate.dto;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="login")
public class LoginDto implements Serializable
{
	@Id
	@GenericGenerator(name="rohan",strategy="increment")
	@GeneratedValue(generator="rohan")
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="password")
	private String password;
	@Column(name="city")
	private String city;
	
	public LoginDto() 
	{
		System.out.println(this.getClass().getSimpleName()+" created....");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "LoginDto [id=" + id + ", name=" + name + ", password=" + password + ", city=" + city + "]";
	}
}