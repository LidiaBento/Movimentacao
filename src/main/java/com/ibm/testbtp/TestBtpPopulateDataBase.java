package com.ibm.testbtp;

import com.ibm.testbtp.model.entity.MovimentacaoFinanceiraEntity;
import com.ibm.testbtp.repository.MovimentacaoFinanceiraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.Random;

@Configuration
public class TestBtpPopulateDataBase {
    private int count = 0;

    private final MovimentacaoFinanceiraRepository movimentacaoFinanceiraRepository;

    @Autowired
    public TestBtpPopulateDataBase(MovimentacaoFinanceiraRepository movimentacaoFinanceiraRepository) {
        this.movimentacaoFinanceiraRepository = movimentacaoFinanceiraRepository;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void doSomethingAfterStartup() {
        Random random = new Random();
        LocalDate startDate = LocalDate.of(2017, 1, 1);
        random.doubles(2190, -10000.0, 10000.0)
                .forEach(d -> movimentacaoFinanceiraRepository.save(MovimentacaoFinanceiraEntity.builder()
                        .data(startDate.plusDays(count++))
                        .valorMovimentado(new BigDecimal(d).setScale(2, RoundingMode.HALF_UP)).build()));
        System.out.println("Finished");
    }
}

