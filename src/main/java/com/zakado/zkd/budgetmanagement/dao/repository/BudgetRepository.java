package com.zakado.zkd.budgetmanagement.dao.repository;

import com.zakado.zkd.budgetmanagement.model.Budget;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BudgetRepository extends JpaRepository<Budget, Integer> {
}
