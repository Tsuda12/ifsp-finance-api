package br.com.vinicius.ifsp_finance_api.service.interfaces;

import br.com.vinicius.ifsp_finance_api.controller.request.FinanceRequestDTO;
import br.com.vinicius.ifsp_finance_api.controller.response.FinanceResponseDTO;

public interface FinanceService {

    FinanceResponseDTO create(FinanceRequestDTO request);
}
