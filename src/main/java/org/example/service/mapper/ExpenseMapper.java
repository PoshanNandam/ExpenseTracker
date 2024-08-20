package org.example.service.mapper;

import org.example.builder.model.ExpenseDTO;
import org.example.service.model.Expense;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ExpenseMapper {

    Expense expenseDTOToExpense(ExpenseDTO expenseDTO);
}
