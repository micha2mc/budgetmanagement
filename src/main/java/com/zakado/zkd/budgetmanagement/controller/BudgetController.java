package com.zakado.zkd.budgetmanagement.controller;

import com.zakado.zkd.budgetmanagement.model.Budget;
import com.zakado.zkd.budgetmanagement.service.BudgetService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/budget")
public class BudgetController {
    private final BudgetService budgetService;

    @GetMapping
    public ResponseEntity<List<Budget>> getAll() {
        List<Budget> budgetList = budgetService.getAllBudget();
        return new ResponseEntity<>(budgetList, HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Budget> searchBudgetByIdMovie(@PathVariable("id") int id){
        return new ResponseEntity<>(budgetService.searchBudgetByIdMovie(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Budget> saveBudget(@RequestBody final Budget budget) {
        return new ResponseEntity<>(budgetService.saveBudget(budget), HttpStatus.CREATED);
    }

}
