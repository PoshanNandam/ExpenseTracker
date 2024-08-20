package org.example.builder.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.model.Category;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "expense")
public class ExpenseDTO {

    @Id
    @GeneratedValue
    @Column(name = "expense_id")
    int expenseId;
    String description;
    @Enumerated(EnumType.STRING)
    Category category;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "account_id")
    AccountDTO accountDTO;
    Date createdAt;
    Date updatedAt;

}
