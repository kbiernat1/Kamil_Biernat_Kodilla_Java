package com.kodilla;

class SalaryPayoutProcessor extends SalaryPayout {
    public SalaryPayoutProcessor(Employee employee) {
        super(employee);
    }

    protected void payout() {
        System.out.println("Sending money to employee");
    }
}