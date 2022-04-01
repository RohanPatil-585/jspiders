package onetoone.util;

import onetoone.dao.OneToOneDAO;
import onetoone.dto.AccountDTO;
import onetoone.dto.CreditCardDTO;

public class OneToOneTester 
{
	public static void main(String[] args) 
	{
		AccountDTO accountDTO = new AccountDTO();
		CreditCardDTO creditCardDTO = new CreditCardDTO();
		accountDTO.setAccount_number(54321);
		accountDTO.setAccount_type("dimet");
		accountDTO.setIfsc("ifsc619");
		
		
		creditCardDTO.setCompany("international");
		creditCardDTO.setLimit(9999.00);
		creditCardDTO.setValidity("1-1-2090");
		
		creditCardDTO.setAccountDTO(accountDTO);
		accountDTO.setCreditCardDTO(creditCardDTO);
		
		OneToOneDAO oneToOneDAO = new OneToOneDAO();
		oneToOneDAO.save(accountDTO);
	}
}