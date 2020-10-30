package com.example.roadtrippin.domain;

import java.math.BigDecimal;
import java.util.List;

public interface SplitCalc {

    BigDecimal splitPerUser(List<Expense> expenses);

    BigDecimal userTotalExpenses(List<Expense> userExpenses);


}
