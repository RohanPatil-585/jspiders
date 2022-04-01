package militry.army.indianArmy.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="confidential")
public class IndianArmyDTO implements Serializable
{
	@Id
	@GenericGenerator(name="rohan",strategy="militry.army.indianArmy.generator.MyGenerator")
	@GeneratedValue(generator="rohan")
	@Column(name="regimentid")
	private int regimentId;
	@Column(name="battalian")
	private String battalian;
	@Column(name="platuns")
	private int platuns;
	@Column(name="sateliteSupport")
	private String sateliteSupport;
	@Column(name="regiment_type")
	private String regimentType;
	@Column(name="artylarysupport")
	private String artilarySupport;
	@Column(name="strength")
	private int strength;
	
	public IndianArmyDTO()
	{
		System.out.println("indian army...");
	}

	public int getRegimentId() {
		return regimentId;
	}

	public void setRegimentId(int regimentId) {
		this.regimentId = regimentId;
	}

	public String getBattalian() {
		return battalian;
	}

	public void setBattalian(String battalian) {
		this.battalian = battalian;
	}

	public int getPlatuns() {
		return platuns;
	}

	public void setPlatuns(int platuns) {
		this.platuns = platuns;
	}

	public String getSateliteSupport() {
		return sateliteSupport;
	}

	public void setSateliteSupport(String sateliteSupport) {
		this.sateliteSupport = sateliteSupport;
	}

	public String getRegimentType() {
		return regimentType;
	}

	public void setRegimentType(String regimentType) {
		this.regimentType = regimentType;
	}

	public String getArtilarySupport() {
		return artilarySupport;
	}

	public void setArtilarySupport(String artilarySupport) {
		this.artilarySupport = artilarySupport;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	@Override
	public String toString() 
	{
		return "IndianArmyDTO [regimentId=" + regimentId + ", battalian="
				+ battalian + ", platuns=" + platuns + ", sateliteSupport="
				+ sateliteSupport + ", regimentType=" + regimentType
				+ ", artilarySupport=" + artilarySupport + ", strength="
				+ strength + "]";
	}
}