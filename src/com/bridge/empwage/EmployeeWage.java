package com.bridge.empwage;

public class EmployeeWage {
    int status;

    private void checkStatus() {

        this.status=((int)(Math.random()*10)%2);
        if(status==1) {
            System.out.println("Employee is present");
        }
        else
            System.out.println("Employee is absent");
    }

    public static void main(String[] args) {

        EmployeeWage employeeWage=new EmployeeWage();
        employeeWage.checkStatus();


    }
}
