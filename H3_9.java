import java.util.Scanner;

public class H3_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month, day;
        String season = "Winter", season1 = "Spring", season2 = "Summer", season3 = "Fall";
        System.out.println("please enter the month: ");
        month = in.nextInt();
        System.out.println("please enter the day: ");
        day = in.nextInt();
        if (month == 1 || month == 2 || month == 3) {
            if (month % 3 == 0 && day > 21)
                System.out.println("the season is : " + season1);

            else
                System.out.println("the season is : " + season);
        }
//----------------------------------------------------
        if (month == 4 || month == 5 || month == 6) {
            if (month % 3 == 0 && day > 21)
                System.out.println("the season is : " + season2);
            else
                System.out.println("the season is : " + season1);
        }
        //-------------------------------------------------
        if (month == 7 || month == 8 || month == 9) {
            if (month % 3 == 0 && day > 21)
                System.out.println("the season is : " + season3);
        else
            System.out.println("the season is : " + season2);
    }
        //------------------------------------------------------
        if (month==10||month==11||month==12) {
            if (month % 3 == 0 && day > 21)
                System.out.println("the season is : " + season);
            else
                System.out.println("the season is : " + season3);
        }
    }
}
