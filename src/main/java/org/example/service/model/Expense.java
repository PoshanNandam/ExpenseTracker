package org.example.service.model;

import lombok.Data;

@Data
public class Expense {
    int expenseId;
    String description;
    String category;
}
