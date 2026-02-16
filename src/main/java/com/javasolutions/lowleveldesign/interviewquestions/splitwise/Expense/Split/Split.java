package com.javasolutions.lowleveldesign.interviewquestions.splitwise.Expense.Split;

import com.javasolutions.lowleveldesign.interviewquestions.splitwise.User.User;

public class Split {

    User user;
    double amountOwe;

    public Split(User user, double amountOwe) {
        this.user = user;
        this.amountOwe = amountOwe;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getAmountOwe() {
        return amountOwe;
    }

    public void setAmountOwe(double amountOwe) {
        this.amountOwe = amountOwe;
    }

}
