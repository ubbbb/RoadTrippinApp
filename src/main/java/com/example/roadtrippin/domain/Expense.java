package com.example.roadtrippin.domain;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "expenses")
public class Expense implements SplitCalc {

    @Id
    private long id;
    /*@ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;*/
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime date;
    private BigDecimal amount;
    private String description;

    @Override
    public BigDecimal splitPerUser(List<Expense> expenses) {
        return null;
    }

    @Override
    public BigDecimal userTotalExpenses(List<Expense> userExpenses) {
        return null;
    }

}
