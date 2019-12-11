package com.ibm.testbtp.controller;

import com.ibm.testbtp.service.ControleFinanceiroService;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ControleFinanceiroControllerTest {

    @InjectMocks
    public ControleFinanceiroController controleFinanceiroController;

    @Mock
    public ControleFinanceiroService service;
}
