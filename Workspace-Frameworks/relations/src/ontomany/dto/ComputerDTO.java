package ontomany.dto;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="computer")
public class ComputerDTO implements Serializable
{
	@Id
	@GenericGenerator(name="rohan", strategy="increment")
	@GeneratedValue(generator="rohan")
	@Column(name="id")
	private Integer id;
	@Column(name="brand")
	private String brand;
	@Column(name="model")
	private String model;
	@Column(name="graphics")
	private boolean graphics;
	
	public ComputerDTO() 
	{
		System.out.println("created "+this.getClass().getSimpleName());
	}
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="comp")
	private Collection<ApplicationDTO> applicationDTOs;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public boolean isGraphics() {
		return graphics;
	}

	public void setGraphics(boolean graphics) {
		this.graphics = graphics;
	}

	public Collection<ApplicationDTO> getApplicationDTOs() {
		return applicationDTOs;
	}

	public void setApplicationDTOs(Collection<ApplicationDTO> applicationDTOs) {
		this.applicationDTOs = applicationDTOs;
	}

	@Override
	public String toString() {
		return "ComputerDTO [id=" + id + ", brand=" + brand + ", model="
				+ model + ", graphics=" + graphics + ", applicationDTOs="
				+ applicationDTOs + "]";
	}
}