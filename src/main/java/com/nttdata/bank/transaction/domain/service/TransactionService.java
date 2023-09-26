package com.nttdata.bank.transaction.domain.service;
import com.nttdata.bank.transaction.domain.model.entity.Transaction;

public interface TransactionService {
  void save(Transaction transaction);
}
