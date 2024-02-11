package com.zakado.zkd.budgetmanagement.service.impl;

import com.zakado.zkd.budgetmanagement.dao.BudgetDAO;
import com.zakado.zkd.budgetmanagement.model.Budget;
import com.zakado.zkd.budgetmanagement.service.BudgetService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BudgetServiceImpl implements BudgetService {

    private final BudgetDAO budgetDAO;

    @Override
    public Budget saveBudget(Budget budget) {
        return budgetDAO.saveBudget(budget);
    }

    @Override
    public Budget updateBudget(Budget budget) {
        return budgetDAO.updateBudget(budget);
    }

    @Override
    public Budget searchBudgetByIdMovie(int id) {
        return budgetDAO.searchBudgetByIdMovie(id);
    }

    @Override
    public List<Budget> getAllBudget() {
        return budgetDAO.getAllBudget();
    }

    @Override
    public void deleteBudget(Integer id) {
        Budget budget = budgetDAO.searchBudgetById(id);

        budgetDAO.deleteMovie(budget);
    }
}
