package com.ibm.testbtp.model.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Digits;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MovimentacaoFinanceiraEntity {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;
        @Digits(integer = 9, fraction = 2)
        private BigDecimal valorMovimentado;
        private LocalDate dataInicio;
        private LocalDate dataFim;

}
