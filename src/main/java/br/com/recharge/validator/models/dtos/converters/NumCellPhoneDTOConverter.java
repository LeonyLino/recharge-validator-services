package br.com.recharge.validator.models.dtos.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import br.com.recharge.validator.models.NumCellPhone;
import br.com.recharge.validator.models.dtos.NumCellPhoneDTO;

@Component
public class NumCellPhoneDTOConverter implements Converter<NumCellPhone, NumCellPhoneDTO> {

	@Override
	public NumCellPhoneDTO convert(NumCellPhone numCellPhone) {
		return NumCellPhoneDTO.builder().number(numCellPhone.getNumber()).active(numCellPhone.isActive())
				.operator(numCellPhone.getOperator()).build();
	}

}
