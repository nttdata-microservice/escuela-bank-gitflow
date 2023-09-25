package com.nttdata.bank.account.domain.service;

import com.nttdata.bank.account.domain.model.entity.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
  List<Customer> getAll();
  Optional<Customer> getById(Integer id);

  Customer save(Customer customer);

  List<Customer> getByAddress(String address);
}
