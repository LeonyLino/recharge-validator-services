package br.com.recharge.validator.services;

import org.springframework.stereotype.Service;

import br.com.recharge.validator.exceptions.NonExistenNumberException;
import br.com.recharge.validator.models.NumCellPhone;
import br.com.recharge.validator.models.dtos.NumCellPhoneDTO;
import br.com.recharge.validator.repositorys.NumCellPhoneRespository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class NumCellPhoneServiceImpl implements NumCellPhoneService {

	private final NumCellPhoneRespository ncpRespository;

	@Override
	public void register(NumCellPhoneDTO dto) {
		ncpRespository.save(new NumCellPhone(null, dto.getNumber(), dto.isActive(), dto.getOperator()));
	}

	@Override
	public boolean validation(String number) {

		NumCellPhone opNumCellPhone = ncpRespository.findByNumber(number)
				.orElseThrow(() -> new NonExistenNumberException("Number not exists."));

		return opNumCellPhone.isActive();
	}

}
