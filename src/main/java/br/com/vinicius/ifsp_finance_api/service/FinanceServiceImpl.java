package br.com.vinicius.ifsp_finance_api.service;

import br.com.vinicius.ifsp_finance_api.controller.request.FinanceRequestDTO;
import br.com.vinicius.ifsp_finance_api.controller.response.FinanceResponseDTO;
import br.com.vinicius.ifsp_finance_api.domain.entity.Finance;
import br.com.vinicius.ifsp_finance_api.domain.repository.FinanceRepository;
import br.com.vinicius.ifsp_finance_api.service.interfaces.FinanceService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FinanceServiceImpl implements FinanceService {

    @Autowired
    private FinanceRepository financeRepository;

    @Override
    @Transactional
    public FinanceResponseDTO create(FinanceRequestDTO request) {
        Finance finance = new Finance(request);
        financeRepository.save(finance);

        return new FinanceResponseDTO(finance);
    }
}
