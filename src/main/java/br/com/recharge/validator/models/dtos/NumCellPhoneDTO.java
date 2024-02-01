package br.com.recharge.validator.models.dtos;

import br.com.recharge.validator.enums.Operator;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NumCellPhoneDTO {

	private String number;
	private boolean active;
	private Operator operator;
}
