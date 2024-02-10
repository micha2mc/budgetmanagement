package com.zakado.zkd.budgetmanagement.dao;

import com.zakado.zkd.budgetmanagement.model.Budget;

import java.util.List;

public interface BudgetDAO {

    Budget saveBudget(Budget budget);
    Budget updateBudget(Budget budget);

    Budget searchBudgetByIdMovie(int id);

    List<Budget> getAllBudget();
}
