package com.ibm.testbtp.repository;

import com.ibm.testbtp.model.entity.MovimentacaoFinanceiraEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovimentacaoFinanceiraRepository extends JpaRepository<MovimentacaoFinanceiraEntity, Long> {
}
