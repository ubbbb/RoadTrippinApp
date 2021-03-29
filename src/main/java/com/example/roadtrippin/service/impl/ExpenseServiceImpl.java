package com.example.roadtrippin.service.impl;

import com.example.roadtrippin.dao.ExpenseDao;
import com.example.roadtrippin.domain.Expense;
import com.example.roadtrippin.dto.ExpenseDto;
import com.example.roadtrippin.mapper.ExpenseMapper;
import com.example.roadtrippin.service.ExpenseService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseServiceImpl implements ExpenseService {

    private ExpenseDao dao;
    private ExpenseMapper mapper;

    public ExpenseServiceImpl(ExpenseDao dao, ExpenseMapper mapper) {
        this.dao = dao;
        this.mapper = mapper;
    }

    @Override
    public ExpenseDto create(ExpenseDto dto) {
        /*dto.setId(null);*/
        Expense toBeCreated = mapper.toExpense(dto);
        return mapper.toExpenseDto(dao.save(toBeCreated));
    }

    @Override
    public List<ExpenseDto> list() {
        return mapper.toDTO(dao.findAll());
    }

    @Override
    public ExpenseDto get(Integer integer) {
        return null;
    }

    @Override
    public ExpenseDto update(ExpenseDto dto) {
        return null;
    }

    @Override
    public void delete(Integer integer) {
    }


}
