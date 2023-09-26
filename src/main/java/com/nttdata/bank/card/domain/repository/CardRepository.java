package com.nttdata.bank.card.domain.repository;

import com.nttdata.bank.card.domain.model.document.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card, Integer> {
}
