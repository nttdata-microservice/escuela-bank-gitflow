package com.nttdata.bank.account.domain.repository;

import com.nttdata.bank.account.domain.model.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

  List<Customer> findByAddress(String address);
}
