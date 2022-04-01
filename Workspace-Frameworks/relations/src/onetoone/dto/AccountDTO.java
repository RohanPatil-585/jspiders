package onetoone.dto;
import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="account")
public class AccountDTO implements Serializable
{
	@Id
	@GenericGenerator(name="account",strategy="increment")
	@GeneratedValue(generator="account")
	@Column(name="acc_id")
	private Integer account_id;
	@Column(name="acc_type")
	private String account_type;
	@Column(name="acc_number")
	private Integer account_number;
	@Column(name="ifsc")
	private String ifsc;
	
	@OneToOne(cascade=CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private CreditCardDTO creditCardDTO;	
	public CreditCardDTO getCreditCardDTO() {
		return creditCardDTO;
	}

	public void setCreditCardDTO(CreditCardDTO creditCardDTO) {
		this.creditCardDTO = creditCardDTO;
	}
	
	public AccountDTO() 
	{
		System.out.println("account dto...");
	}

	public Integer getAccount_id() {
		return account_id;
	}

	public void setAccount_id(Integer account_id) {
		this.account_id = account_id;
	}

	public String getAccount_type() {
		return account_type;
	}

	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}

	public Integer getAccount_number() {
		return account_number;
	}

	public void setAccount_number(Integer account_number) {
		this.account_number = account_number;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	@Override
	public String toString() {
		return "AccountDTO [account_id=" + account_id + ", account_type="
				+ account_type + ", account_number=" + account_number
				+ ", ifsc=" + ifsc + "]";
	}
}