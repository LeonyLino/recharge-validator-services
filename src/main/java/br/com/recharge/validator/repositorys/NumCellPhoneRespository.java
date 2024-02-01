package br.com.recharge.validator.repositorys;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.recharge.validator.models.NumCellPhone;

@Repository
public interface NumCellPhoneRespository extends JpaRepository<NumCellPhone, Long> {

	Optional<NumCellPhone> findByNumber(String number);
}
