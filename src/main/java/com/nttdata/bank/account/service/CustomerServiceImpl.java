package com.nttdata.bank.account.service;

import com.nttdata.bank.account.domain.model.entity.Customer;
import com.nttdata.bank.account.domain.repository.CustomerRepository;
import com.nttdata.bank.account.domain.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class CustomerServiceImpl implements CustomerService {

  private final CustomerRepository customerRepository;

  @Override
  public List<Customer> getAll() {
    return customerRepository.findAll();
  }

  @Override
  public Optional<Customer> getById(Integer id) {
    return customerRepository.findById(id);
  }

  @Override
  public Customer save(Customer customer) {
    return customerRepository.save(customer);
  }

  @Override
  public List<Customer> getByAddress(String address) {
    return customerRepository.findByAddress(address);
  }
}
