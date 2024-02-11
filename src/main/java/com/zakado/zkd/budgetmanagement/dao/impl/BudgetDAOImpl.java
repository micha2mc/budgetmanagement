package com.zakado.zkd.budgetmanagement.dao.impl;

import com.zakado.zkd.budgetmanagement.dao.BudgetDAO;
import com.zakado.zkd.budgetmanagement.dao.repository.BudgetRepository;
import com.zakado.zkd.budgetmanagement.model.Budget;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@RequiredArgsConstructor
@Repository
public class BudgetDAOImpl implements BudgetDAO {
    private final BudgetRepository budgetRepository;

    @Override
    public Budget saveBudget(Budget budget) {
        return budgetRepository.save(budget);
    }

    @Override
    public Budget updateBudget(Budget budget) {
        return null;
    }

    @Override
    public Budget searchBudgetByIdMovie(int id) {
        return budgetRepository.findByIdmov(id);
    }

    @Override
    public List<Budget> getAllBudget() {
        return budgetRepository.findAll();
    }

    @Override
    public Budget searchBudgetById(Integer id) {
        return budgetRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteMovie(Budget budget) {
        budgetRepository.delete(budget);
    }
}
