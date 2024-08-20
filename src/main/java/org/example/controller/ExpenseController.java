package org.example.controller;


import lombok.val;
import org.example.service.ExpenseService;
import org.example.service.model.Expense;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ExpenseController {

    @Autowired
    ExpenseService expenseService;

    @GetMapping("/expense")
    public ResponseEntity<List<Expense>> getExpenses(@RequestParam int accountId){
        val expenseList = expenseService.getExpenses(accountId);
        return ResponseEntity
                .accepted()
                .body(expenseList);
    }
}
