package com.nttdata.bank.transaction.domain.model.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Transaction {
  private Integer id;
  private String type;
  private String amount;
}
