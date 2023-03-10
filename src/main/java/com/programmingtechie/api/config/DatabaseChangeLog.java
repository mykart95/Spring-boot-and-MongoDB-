package com.programmingtechie.api.config;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.github.cloudyrock.mongock.ChangeLog;
import com.github.cloudyrock.mongock.ChangeSet;
import com.programmingtechie.api.model.Expense;
import com.programmingtechie.api.model.ExpenseCategory;
import com.programmingtechie.api.repository.ExpenseRepository;

import static com.programmingtechie.api.model.ExpenseCategory.*;


@ChangeLog
public class DatabaseChangeLog {

	@ChangeSet(order = "001", id = "seeDatabase", author = "karthik")
	public void seeDatabase(ExpenseRepository expenseRepository) {
		List<Expense> expenseList= new ArrayList<>();
		expenseList.add(createExpense("Movie Ticket", ENTERTAINMENT, BigDecimal.valueOf(15)));
		expenseList.add(createExpense("Dinner", RESTAURANT, BigDecimal.valueOf(10)));
		expenseList.add(createExpense("Prime Now", ENTERTAINMENT, BigDecimal.valueOf(12)));
		expenseList.add(createExpense("Gym", MISC, BigDecimal.valueOf(25)));
		expenseList.add(createExpense("Internet", UTILITIES, BigDecimal.valueOf(30)));
		expenseRepository.insert(expenseList);
	}
	
	private Expense createExpense(String expenseName, ExpenseCategory expenseCategory, BigDecimal amount) {
		
		Expense expense = new Expense();
		expense.setExpenseName(expenseName);
		expense.setExpenseAmont(amount);
		expense.setExpenseCategory(expenseCategory);
		return expense;
		
	}
}
