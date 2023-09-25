package com.nttdata.bank.account.api;

import com.nttdata.bank.account.domain.model.entity.Customer;
import com.nttdata.bank.account.domain.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("api/v1/customers")
public class CustomerController {
  private final CustomerService customerService;

  @GetMapping
  public List<Customer> fetchAll() {
    return customerService.getAll();
  }


  @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE,
          consumes = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<Customer> create(@RequestBody Customer customer) {
    return new ResponseEntity<>(customerService.save(customer), HttpStatus.CREATED);
  }

  @PostMapping(value = "testing", consumes = MediaType.TEXT_PLAIN_VALUE,
    produces = MediaType.TEXT_PLAIN_VALUE)
  public ResponseEntity<String> testing(@RequestBody String texto) {
    return ResponseEntity.ok(texto + " - retorno");
  }

  @GetMapping("address/{address}")
  public List<Customer> fetchByAddress(@PathVariable String address) {
    return customerService.getByAddress(address);
  }

}
