package com.brodglabz.Employee;

public class EmployeeWage {
    public  static final int FULL_TIME=1;
    public static final int PART_TIME=2;
    public static final int EMP_RATE_PER_HOUR=40;
   public static final  int NUM_OF_WORKING_DAYS=20;
    public static void main(String[] args) {
        int empHrs = 0;
        int empTotalWage = 0;
        int empWage = 0;
        for (int Day = 1; Day <= NUM_OF_WORKING_DAYS; Day++) {
            int empCheck = (int) Math.floor((Math.random() * 10) % 3);
            if (empCheck == 1) {
                empHrs = 8;

            } else if (empCheck == 2) {
                empHrs = 4;
            } else {
                empHrs = 0;

            }
            empWage = EMP_RATE_PER_HOUR * empHrs;
            empTotalWage += empWage;
        }
            System.out.println("EmpWage====>" + empTotalWage);
        }
    }


