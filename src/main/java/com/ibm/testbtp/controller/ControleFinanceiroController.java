package com.ibm.testbtp.controller;

import com.ibm.testbtp.model.entity.MovimentacaoFinanceiraEntity;
import com.ibm.testbtp.model.response.MovimentacaoFinanceiraResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("api")
public class ControleFinanceiroController {

    @GetMapping("/calcula_media_credor/{dataInicio}/{dataFim}")
    public ResponseEntity<MovimentacaoFinanceiraResponse> getPorcentagemMediaCredor(@PathVariable(value= "dataInicio") LocalDate dataInicio, @RequestBody
            MovimentacaoFinanceiraEntity movimentacaoFinanceiraEntity, @PathVariable("dataFim") LocalDate dataFim) {
        return null;
    }
}
