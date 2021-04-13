package com.example.roadtrippin.dto;

import com.example.roadtrippin.domain.User;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class ExpenseDto {

    private Long id;
    private User user;
    private String date; //LocalDateTime temporary replaced
    private BigDecimal amount;
    private String description;

}
