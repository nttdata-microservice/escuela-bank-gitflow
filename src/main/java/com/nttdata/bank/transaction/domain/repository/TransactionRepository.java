package com.nttdata.bank.transaction.domain.repository;

import com.nttdata.bank.card.domain.model.document.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Card, Integer> {
}
