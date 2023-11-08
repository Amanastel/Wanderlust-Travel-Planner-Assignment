package com.Wanderlust.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Expense {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer expenseID;
    private LocalDateTime expenseDate;;
    @DecimalMin("0.0")
    private Double amount;
    private String category;
    private Float CurrentBalance;
    @Enumerated(EnumType.STRING)
    private ExpenseType type;

}
