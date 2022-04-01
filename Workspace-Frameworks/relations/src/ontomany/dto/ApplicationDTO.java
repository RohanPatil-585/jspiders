package ontomany.dto;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="application")
public class ApplicationDTO implements Serializable
{
	@Id
	@GenericGenerator(name="rohan", strategy="increment")
	@GeneratedValue(generator="rohan")
	@Column(name="id")
	private Integer app_id;
	@Column(name="app_name")
	private String app_name;
	@Column(name="app_version")
	private String app_version;
	@Column(name="app_plateform")
	private String app_plateform;
	
	public ApplicationDTO() 
	{
		System.out.println("created "+this.getClass().getSimpleName());
	}

	public Integer getApp_id() {
		return app_id;
	}

	public void setApp_id(Integer app_id) {
		this.app_id = app_id;
	}

	public String getApp_name() {
		return app_name;
	}

	public void setApp_name(String app_name) {
		this.app_name = app_name;
	}

	public String getApp_version() {
		return app_version;
	}

	public void setApp_version(String app_version) {
		this.app_version = app_version;
	}

	public String getApp_plateform() {
		return app_plateform;
	}

	public void setApp_plateform(String app_plateform) {
		this.app_plateform = app_plateform;
	}

	@Override
	public String toString() {
		return "ApplicationDTO [app_id=" + app_id + ", app_name=" + app_name
				+ ", app_version=" + app_version + ", app_plateform="
				+ app_plateform + "]";
	}	
}