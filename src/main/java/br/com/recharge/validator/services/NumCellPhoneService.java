package br.com.recharge.validator.services;

import br.com.recharge.validator.models.dtos.NumCellPhoneDTO;

public interface NumCellPhoneService {

	void register(NumCellPhoneDTO dto);
	
	boolean validation(String number);

}
