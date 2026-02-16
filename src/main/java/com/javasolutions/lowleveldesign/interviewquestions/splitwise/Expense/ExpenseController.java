package com.javasolutions.lowleveldesign.interviewquestions.splitwise.Expense;

import com.javasolutions.lowleveldesign.interviewquestions.splitwise.BalanceSheetController;
import com.javasolutions.lowleveldesign.interviewquestions.splitwise.Expense.Split.ExpenseSplit;
import com.javasolutions.lowleveldesign.interviewquestions.splitwise.Expense.Split.Split;
import com.javasolutions.lowleveldesign.interviewquestions.splitwise.User.User;

import java.util.List;

public class ExpenseController {

    BalanceSheetController balanceSheetController;

    public ExpenseController() {
        balanceSheetController = new BalanceSheetController();
    }

    public Expense createExpense(String expenseId, String description, double expenseAmount,
                                 List<Split> splitDetails, ExpenseSplitType splitType, User paidByUser) {

        ExpenseSplit expenseSplit = SplitFactory.getSplitObject(splitType);
        expenseSplit.validateSplitRequest(splitDetails, expenseAmount);

        Expense expense = new Expense(expenseId, expenseAmount, description, paidByUser, splitType, splitDetails);

        balanceSheetController.updateUserExpenseBalanceSheet(paidByUser, splitDetails, expenseAmount);

        return expense;
    }
}
