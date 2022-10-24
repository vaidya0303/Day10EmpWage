
package com.bridgelab;

public class EmpWage {


    public static void main(String args[]) {

        final int PART_TIME = 1;
        final int FULL_TIME = 2;
        final int WAGE_PER_HR = 20;
        int empType = (int) (Math.random() * 100) % 3;
        int workingHours =0;

        /*
        using switch statment
         */
        switch (empType)
        {
            case FULL_TIME:
                System.out.println("Employee is Present Full time");  //condition 1
                workingHours = 8;
                break;

            case PART_TIME:
                System.out.println("Employee is Present Part time"); //condition 2
                workingHours = 4;
                break;

            default:                                           //default statment if case 1 and 2 is fail then default is print
                System.out.println("Employee is Absent");
        }
        int wage = workingHours * WAGE_PER_HR;
        System.out.println("Employee Daily Wage is " + wage);
    }
}