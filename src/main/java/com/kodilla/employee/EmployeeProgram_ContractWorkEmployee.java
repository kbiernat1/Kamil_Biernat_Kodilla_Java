package com.kodilla.employee;

class ContractWorkEmployee implements Employee {
    private int productQuantity;
    private int perHour;

    public ContractWorkEmployee (int pq, int ph) {
        this.productQuantity = pq;
        this.perHour = ph;
    }

    public double calculateSalary() {
        return this.productQuantity * this.perHour;
    }
}
