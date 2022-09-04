import java.util.Scanner;

public class H3_8 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String name;
        double work_hours,hourly_wage=9.25,salary,salary1,extra_work;
        System.out.println("please enter the information of employee :");
        System.out.println("enter the name of employee :");
        name= in.next();
        System.out.println("enter the work hours for last week :");
        work_hours= in.nextDouble();
        salary=40*hourly_wage;
        if (work_hours>40) {
            extra_work=(work_hours-40)* (hourly_wage*(150.0/100));
            salary1 = salary +extra_work;
            System.out.println("the salary of employee " + name + " for last week is " + salary1+"$");
        }
        else
            System.out.println("the salary of employee " + name + " for last week is " + salary+"$");
    }
}
