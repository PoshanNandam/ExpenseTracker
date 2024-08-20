package org.example.builder;

import org.example.builder.model.ExpenseDTO;
import org.example.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExpenseBuilder {
    @Autowired
    ExpenseRepository expenseRepository;

    public ExpenseDTO saveExpense(ExpenseDTO expenseDTO){
        return expenseRepository.save(expenseDTO);
    }

    public Iterable<ExpenseDTO> getExpensesByAccount(int accountId){
        return expenseRepository.findByAccountDTO_AccountId(accountId);
    }
}
