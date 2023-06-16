package com.brodglabz.Employee;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("welcome to employeePayroll");
        int FULL_TIME=1;
        int empCheck=(int)Math.floor((Math.random()*10)%2);
        if(empCheck==1){
            System.out.println("Employee is present");
        }else {
            System.out.println("Employee is absent");
        }
    }
}
