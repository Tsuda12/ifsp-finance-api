package br.com.vinicius.ifsp_finance_api.controller;

import br.com.vinicius.ifsp_finance_api.controller.request.FinanceRequestDTO;
import br.com.vinicius.ifsp_finance_api.controller.response.FinanceResponseDTO;
import br.com.vinicius.ifsp_finance_api.service.interfaces.FinanceService;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/finance")
public class FinanceController {

    @Autowired
    private FinanceService financeService;

    @PostMapping
    @Operation(summary = "Create Finance")
    public ResponseEntity<FinanceResponseDTO> create(@RequestBody @Valid FinanceRequestDTO request, UriComponentsBuilder uriBuilder) {
        FinanceResponseDTO response = financeService.create(request);

        var uri = uriBuilder.path("/finance/{id}").buildAndExpand(response.id).toUri();

        return ResponseEntity.created(uri).body(response);
    }
}
