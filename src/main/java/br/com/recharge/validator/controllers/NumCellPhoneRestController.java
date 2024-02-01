package br.com.recharge.validator.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.recharge.validator.exceptions.NonExistenNumberException;
import br.com.recharge.validator.services.NumCellPhoneService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api/v1/numcellphone")
@RequiredArgsConstructor
public class NumCellPhoneRestController {

	private final NumCellPhoneService ncpService;

	@GetMapping("validation/{number:[0-9]+}")
	public ResponseEntity<Object> validation(@PathVariable("number") String number) {
		try {
			return ResponseEntity.status(HttpStatus.OK).body(ncpService.validation(number));
		} catch (NonExistenNumberException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
		}
	}

}
