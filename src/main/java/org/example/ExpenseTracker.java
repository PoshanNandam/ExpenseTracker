package org.example;

import org.example.builder.model.AccountDTO;
import org.example.builder.model.ExpenseDTO;
import org.example.model.Category;
import org.example.repository.AccountRepository;
import org.example.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExpenseTracker implements CommandLineRunner {

    @Autowired
    ExpenseRepository expenseRepository;
    @Autowired
    AccountRepository accountRepository;


    public static void main(String[] args) {
        SpringApplication.run(ExpenseTracker.class, args);
    }


    @Override
    public void run(String... args) {
        AccountDTO accountDTO = AccountDTO.builder().userName("Poshan").build();
        accountRepository.save(accountDTO);
        expenseRepository.save(ExpenseDTO.builder().description("Phone").category(Category.Electronics).accountDTO(accountDTO).build());
        expenseRepository.save(ExpenseDTO.builder().description("Watch").category(Category.Electronics).accountDTO(accountDTO).build());
        expenseRepository.save(ExpenseDTO.builder().description("Laptop").category(Category.Electronics).accountDTO(accountDTO).build());
        accountRepository.findAll().iterator().forEachRemaining(System.out::println);
    }
}