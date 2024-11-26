package br.com.vinicius.ifsp_finance_api.controller.response;

import br.com.vinicius.ifsp_finance_api.domain.entity.Finance;
import br.com.vinicius.ifsp_finance_api.domain.enums.TagEnum;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;

import java.time.LocalDate;

@Getter
public class FinanceResponseDTO {
    public Long id;
    @JsonFormat(pattern = "dd/MM/yyyy")
    public LocalDate date;
    public String occurrence;
    public TagEnum tagEnum;
    public Double value;

    public FinanceResponseDTO(Finance entity) {
        this.id = entity.getId();
        this.date = entity.getDate();
        this.occurrence = entity.getOccurrence();
        this.tagEnum = entity.getTagEnum();
        this.value = entity.getValue();
    }
}
