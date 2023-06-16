package com.brodglabz.Employee;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("welcome to employeePayroll");
        int FULL_TIME=1;
        int PART_TIME=2;
        int EMP_RATE_PER_HOUR=40;
        int empHrs=0;
        int empTotalWage=0;
        int empCheck=(int)Math.floor((Math.random()*10)%3);
        if(empCheck==1){
            empHrs=8;
            System.out.println("Employee is FullTimeHrs");
        }else if(empCheck==2){
            System.out.println("Employee is partTimeHrs");
            empHrs=4;
        }
        else {
            empHrs=0;
            System.out.println("Employee is absent");
        }
        empTotalWage=empHrs*EMP_RATE_PER_HOUR;
        System.out.println("EmpWage====>"+empTotalWage);
    }

}
