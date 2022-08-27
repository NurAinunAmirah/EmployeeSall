package com.first.EmployeeSall.domain;

public class Employee {
    private double salary;
    private double tax;
    private double nsal;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getTax() {

        if(salary > 50000){
            tax= salary * 10/100;
        }else if(salary>35000){
            tax=salary * 5/100;

        }else{
            tax=0;
        }
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getNsal() {
        nsal= salary-tax;
        return nsal;
    }

    public void setNsal(double nsal) {
        this.nsal = nsal;
    }
}
