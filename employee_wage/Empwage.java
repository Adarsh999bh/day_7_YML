package employee_wage;
import java.util.Scanner;
class Company{
    
    //inner class Employee
    class Employee{

        // Employee(){
        // }
        public int employee_working_status_for_the_day;//absent 0 part-time 1 full-time 2
        public int monthly_overtime;
        public int total_hours_worked_in_month;
        public int total_wage_per_month;
        public void employeeDetails(){
            System.out.println("total hours worked in month : "+total_hours_worked_in_month);
            System.out.println("total wage per month : "+total_wage_per_month);
            //System.out.println("Monthly overtime : "+this.monthly_overtime);
        }
        public void setStatus(int employee_working_status_for_the_day){
            this.employee_working_status_for_the_day=employee_working_status_for_the_day;
        }
        public void printStatus(int emp_no,int day){
            if(this.employee_working_status_for_the_day==0){
                System.out.println("Employee "+emp_no+" is Absent on day "+day);
            }
            else if(this.employee_working_status_for_the_day==1){
                System.out.println("Employee "+emp_no+" is present (part-time) on day "+day);
            }
            else{
                System.out.println("Employee "+emp_no+" is present (full-time) on day "+day);
            }
        }
    }
    //end of Employee class

    //basic(fixed) attributes
    public String compName;
    public int max_working_hours_per_month,part_time_hour,full_time_hour,employee_wage_per_hour,no_working_days_per_month;
    //calculating(changing) attributes
    public int cost_for_comp_part_emp,cost_for_comp_full_emp,no_of_emp;
    public Employee[] ep;

    //constructor
    Company(String compName,int max_working_hours_per_month,int part_time_hour,int full_time_hour,int employee_wage_per_hour,int no_working_days_per_month,int no_of_emp){
        this.compName=compName;
        this.max_working_hours_per_month=max_working_hours_per_month;
        this.part_time_hour=part_time_hour;
        this.full_time_hour=full_time_hour;
        this.employee_wage_per_hour=employee_wage_per_hour;
        this.no_of_emp=no_of_emp;
        this.no_working_days_per_month=no_working_days_per_month;
        this.ep=new Employee[this.no_of_emp];
    }

    //company details printing
    public void displayCompDetails(){
        System.out.println("Company name : "+compName);
        System.out.println("Max working hours per month : "+max_working_hours_per_month);
        System.out.println("Part-time hour : "+part_time_hour);
        System.out.println("Full-time hour : "+full_time_hour);
        System.out.println("Employye wage per hour : "+employee_wage_per_hour);
        System.out.println("Number of working days in a month : "+no_working_days_per_month);
        System.out.println("total cost for company on part-time employee is "+cost_for_comp_part_emp);
        System.out.println("total cost for company on full-time employee is "+cost_for_comp_full_emp);
    }
}


public class Empwage{
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program.!");
        Scanner sc_int=new Scanner(System.in);
        Scanner sc_string=new Scanner(System.in);
        System.out.println("Enter the no of Companies");
        int n=sc_int.nextInt();
        Company[] cp=new Company[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter the company name : ");
            String compname=sc_string.nextLine();
            sc_string.close();
            System.out.print("Enter the number of employees : ");
            int no_e=sc_int.nextInt();
            System.out.print("Enter max working hours per month : ");
            int mwh=sc_int.nextInt();
            System.out.print("Enter part-time hour : ");
            int pt=sc_int.nextInt();
            System.out.print("Enter full-time hour : ");
            int ft=sc_int.nextInt();
            System.out.print("Enter employee wage per hour : ");
            int wph=sc_int.nextInt();
            System.out.print("Enter the number of working days in month : ");
            int wds=sc_int.nextInt();
            cp[i]=new Company(compname, mwh, pt, ft, wph, wds, no_e);
        }
        sc_int.close();
        sc_string.close();
        
    }
}