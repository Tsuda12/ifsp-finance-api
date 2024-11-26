package br.com.vinicius.ifsp_finance_api.domain.repository;

import br.com.vinicius.ifsp_finance_api.domain.entity.Finance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FinanceRepository extends JpaRepository<Finance, Long> {
}
