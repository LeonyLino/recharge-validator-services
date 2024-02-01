package br.com.recharge.validator.models;

import br.com.recharge.validator.enums.Operator;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@SequenceGenerator(name = "seqNumCellPhone", sequenceName = "seqNumCellPhone", initialValue = 1, allocationSize = 1)
public class NumCellPhone {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqNumCellPhone")
	private Long id;
	@Column(nullable = false)
	private String number;
	@Column(nullable = false)
	private boolean active;
	@Column(nullable = false)
	private Operator operator;

}
