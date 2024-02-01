package br.com.recharge.validator.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.recharge.validator.enums.Operator;
import br.com.recharge.validator.models.dtos.NumCellPhoneDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class LoadDataService {

	private final NumCellPhoneService numCellPhoneService;

	public String load() {
		log.info("Starting Load Data to Numbers is Cell Phone");
		this.buildDTOToLoad().stream().forEach(numCellPhoneService::register);
		log.info("Finish Load Data to Numbers is Cell Phone");
		return "Done";
	}

	private List<NumCellPhoneDTO> buildDTOToLoad() {
		List<NumCellPhoneDTO> nums = new ArrayList<>();
		nums.add(NumCellPhoneDTO.builder().active(true).number("83996686269").operator(Operator.VIVO).build());
		nums.add(NumCellPhoneDTO.builder().active(true).number("67991497822").operator(Operator.CLARO).build());
		nums.add(NumCellPhoneDTO.builder().active(true).number("73982468786").operator(Operator.TIM).build());
		nums.add(NumCellPhoneDTO.builder().active(true).number("93967560214").operator(Operator.VIVO).build());
		nums.add(NumCellPhoneDTO.builder().active(true).number("61994377146").operator(Operator.CLARO).build());
		nums.add(NumCellPhoneDTO.builder().active(true).number("81981335547").operator(Operator.TIM).build());

		return nums;
	}

}
