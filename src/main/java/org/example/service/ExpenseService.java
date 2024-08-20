package org.example.service;

import org.example.builder.ExpenseBuilder;
import org.example.builder.model.ExpenseDTO;
import org.example.service.mapper.ExpenseMapper;
import org.example.service.model.Expense;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ExpenseService {

    @Autowired
    ExpenseBuilder expenseBuilder;

    @Autowired
    ExpenseMapper expenseMapper;

    public ExpenseDTO saveExpense(ExpenseDTO expenseDTO){
        return expenseBuilder.saveExpense(expenseDTO);
    }

    public List<Expense> getExpenses(int accountId){
        Iterable<ExpenseDTO> expenseDTO = expenseBuilder.getExpensesByAccount(accountId);
        List<Expense> expenseList = new ArrayList<>();
        expenseDTO.forEach(expenseDTO1 -> expenseList.add(expenseMapper.expenseDTOToExpense(expenseDTO1)));
        return expenseList;
    }
}
