package com.example.roadtrippin.domain;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "expenses")
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    /*    @DateTimeFormat(pattern = "yyyy-MM-dd")*/
    private String date; //LocalDateTime temporary replaced
    private BigDecimal amount;
    private String description;

}
