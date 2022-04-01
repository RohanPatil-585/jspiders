package onetoone.dto;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="creditcard")
public class CreditCardDTO implements Serializable
{
	@Id
	@GenericGenerator(name="card",strategy="increment")
	@GeneratedValue(generator="card")
	@Column(name="cre_id")
	private Integer cardID;
	@Column(name="company")
	private String company;
	@Column(name="validity")
	private String validity;
	@Column(name="limit1")
	private Double limit;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="ac_id")
	private AccountDTO accountDTO;
	
	public CreditCardDTO() 
	{
		System.out.println("creditcard dto...");
	}

	public Integer getCardID() {
		return cardID;
	}

	public void setCardID(Integer cardID) {
		this.cardID = cardID;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getValidity() {
		return validity;
	}

	public void setValidity(String validity) {
		this.validity = validity;
	}

	public Double getLimit() {
		return limit;
	}

	public void setLimit(Double limit) {
		this.limit = limit;
	}

	public AccountDTO getAccountDTO() {
		return accountDTO;
	}

	public void setAccountDTO(AccountDTO accountDTO) {
		this.accountDTO = accountDTO;
	}

	@Override
	public String toString() {
		return "CreditCardDTO [cardID=" + cardID + ", company=" + company
				+ ", validity=" + validity + ", limit=" + limit
				+ ", accountDTO=" + accountDTO + "]";
	}
}