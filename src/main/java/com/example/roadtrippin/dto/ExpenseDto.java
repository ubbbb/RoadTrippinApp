package com.example.roadtrippin.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class ExpenseDto {

    private Long id;
    /*private User user;*/
    private LocalDateTime date;
    private BigDecimal amount;
    private String description;

}
