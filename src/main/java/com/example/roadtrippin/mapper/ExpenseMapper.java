package com.example.roadtrippin.mapper;

import com.example.roadtrippin.domain.Expense;
import com.example.roadtrippin.dto.ExpenseDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ExpenseMapper {

    ExpenseDto toExpenseDto(Expense expense);

    Expense toExpense(ExpenseDto dto);

    Iterable<Expense> toExpenseDB(List<ExpenseDto> expenseDtoList);

    List<ExpenseDto> toDTO(List<Expense> expenseList);

}
