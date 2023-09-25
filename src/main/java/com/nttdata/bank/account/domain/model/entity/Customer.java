package com.nttdata.bank.account.domain.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "customers")  // Snake
public class Customer { // Upper Camel Case

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;   // lower Camel Case

  @Column(name = "last_name", length = 50, nullable = false)
  private String lastName;

  @Column(name = "first_name", length = 50, nullable = false)
  private String firstName;

  @Column(name = "age", nullable = false)
  private Integer age;

  @Column(name = "address", length = 25)
  private String address;

  @Column(name = "salary", columnDefinition = "DECIMAL (18,2)")
  private Float salary;

}
