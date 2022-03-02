package com.kodilla;

class BonusSalaryEmployee implements Employee {
    private double salary;
    private boolean bonus;

    public BonusSalaryEmployee(double salary, boolean b) {
        this.salary = salary;
        this.bonus = b;
    }

    public double calculateSalary() {
        if (this.bonus) {
            return this.salary * 1.2;
        } else {
            return this.salary;
        }
    }
}
