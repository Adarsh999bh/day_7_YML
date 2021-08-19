package ep_wage;
import java.util.Scanner;

public class empwage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program.!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of employees");
        int n=sc.nextInt();
        sc.close();
        int pt_wage=0,ft_wage=0;
        int ep_wage[]=new int[n];
        for(int j=0;j<20;j++){
            for (int i=0;i<n;i++){
                int status=(int) (Math.floor(Math.random()*10)%3);
                if(status==0){
                    System.out.println("Employee "+(i+1)+" is Absent on day "+j);
                }
                else if (status==1){
                    System.out.println("Employee "+(i+1)+" is Present (Part-time) on day "+j);
                    pt_wage+=80;
                    ep_wage[i]+=80;
                }
                else{
                    System.out.println("Employee "+(i+1)+" is Present (Full-time) on day "+j);
                    ft_wage+=160;
                    ep_wage[i]=160;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.println("monthly wage for Employee "+(i+1)+" is "+ep_wage[i]);
        }
        System.out.println("total cost for company on part-time employee is "+pt_wage);
        System.out.println("total cost for company on full-time employee is "+ft_wage);
        System.out.println("total cost for company on it's employees is "+(pt_wage+ft_wage));
    }
    
}
