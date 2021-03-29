package com.example.roadtrippin.dao;

import com.example.roadtrippin.domain.Expense;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExpenseDao extends CrudRepository<Expense, Long> {

    List<Expense> findAll();

}
