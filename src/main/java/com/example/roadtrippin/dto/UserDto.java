package com.example.roadtrippin.dto;

import com.example.roadtrippin.domain.Expense;
import lombok.Data;

import java.util.List;

@Data
public class UserDto {

    private long id;
    private String name;
    private List<Expense> expenseList;

}
