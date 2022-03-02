package com.kodilla.employee;

public class EmployeeProgram {
    public static void main(String args[]) {
        ContractWorkEmployee employee2 = new ContractWorkEmployee(1000, 5);
        BonusSalaryEmployee employee3 = new BonusSalaryEmployee(2000, true);

        SalaryPayoutProcessor processor2 = new SalaryPayoutProcessor(employee2);
        SalaryPayoutProcessor processor3 = new SalaryPayoutProcessor(employee3);

        processor2.processPayout();
        processor3.processPayout();
    }
}