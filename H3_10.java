import java.util.Scanner;

public class H3_10 {    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int number_month;
    System.out.println("please enter the number of the month: ");
    number_month= in.nextInt();
    if(number_month==1)
        System.out.println("the month is January and the days of January is 31 days");
    else if(number_month==2)
        System.out.println("the month is February and the days of February is 28 days");
    else if(number_month==3)
        System.out.println("the month is March and the days of March is 31 days");
    else if(number_month==4)
        System.out.println("the month is April and the days of April is 30 days");
    else if(number_month==5)
        System.out.println("the month is May and the days of May is 31 days");
    else if(number_month==6)
        System.out.println("the month is June and the days of June is 30 days");
    else if(number_month==7)
        System.out.println("the month is July and the days of July is 31 days");
    else if(number_month==8)
        System.out.println("the month is August and the days of August is 31 days");
    else if(number_month==9)
        System.out.println("the month is September and the days of September is 30 days");
    else if(number_month==10)
        System.out.println("the month is October and the days of October is 31 days");
    else if(number_month==11)
        System.out.println("the month is November and the days of November is 30 days");
    else if(number_month==12)
        System.out.println("the month is December and the days of December is 31 days");
}
}
