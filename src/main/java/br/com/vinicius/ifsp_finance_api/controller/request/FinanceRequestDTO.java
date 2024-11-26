package br.com.vinicius.ifsp_finance_api.controller.request;

import br.com.vinicius.ifsp_finance_api.domain.enums.TagEnum;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record FinanceRequestDTO(
        @NotNull
        LocalDate date,
        @NotBlank
        String occurrence,
        @NotNull
        TagEnum tagEnum,
        @NotNull
        Double value
) {}
