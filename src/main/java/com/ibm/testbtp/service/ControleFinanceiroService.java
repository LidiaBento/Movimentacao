package com.ibm.testbtp.service;

import com.ibm.testbtp.model.entity.MovimentacaoFinanceiraEntity;

public interface ControleFinanceiroService {

    MovimentacaoFinanceiraEntity calculaPorcentagemMedia(MovimentacaoFinanceiraEntity movimentacaoFinanceira);

}
