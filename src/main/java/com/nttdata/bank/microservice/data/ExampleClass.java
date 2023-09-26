package com.nttdata.bank.microservice.data;

import com.nttdata.bank.card.domain.repository.CardRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ExampleClass {
    private CardRepository cardRepository;

    public String doSomething() {
        return "Hello";
    }
}
