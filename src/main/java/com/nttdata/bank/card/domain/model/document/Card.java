package com.nttdata.bank.card.domain.model.document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Card {
  private Integer id;
  private String numberCard;
  private String ammount;
}
