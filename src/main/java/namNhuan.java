import java.util.Scanner;

public class namNhuan {
    public static void main(String[] args) {
        int year;
        Scanner year1 = new Scanner(System.in);
        System.out.println("Enter the year");
        year = year1.nextInt();
        boolean check = false;
        boolean isDivisibleBy4= year %4 ==0;
        if (isDivisibleBy4) {
            boolean isDivisibleBy100=year %100==0;
             if (isDivisibleBy100) {
                 boolean isDivisibleby400= year %100==0;
                 if(isDivisibleby400) {
                     check=true;
                 } else {check =false;}

             } else  {
                 check=true;
             }
                    }
        if (check) {
            System.out.printf("%d khong phai la nam nhuan",year);
        } else {
            System.out.printf(" %d la nam nhuan",year);}

    }

        }


