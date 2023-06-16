package com.brodglabz.Employee;

public class EmployeeWage {
    public  static final int FULL_TIME=1;
    public static final int PART_TIME=2;
    public static final int EMP_RATE_PER_HOUR=40;
    public static void main(String[] args) {
        int empHrs = 0;
        int empWage = 0;
            int empCheck = (int) Math.floor((Math.random() * 10) % 3);
            switch(empCheck) {
                case 0:
                    empHrs = 0;
                    break;
                case 1:
                    empHrs = 8;
                    break;
                case 2:
                    empHrs = 4;
                    break;
                default:
                    break;
            }
            empWage = EMP_RATE_PER_HOUR * empHrs;


            System.out.println("EmpWage====>" + empWage);
        }
    }


