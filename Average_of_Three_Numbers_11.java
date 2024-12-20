package W3resource.com;

import java.util.Scanner;

public class Average_of_Three_Numbers_11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter a first number:");
        int N1=sc.nextInt();
        System.out.println("enter a second number:");
        int N2=sc.nextInt();
        System.out.println("enter a third number:");
        int N3=sc.nextInt();
        System.out.println("enter a forth number:");
        int N4=sc.nextInt();
        System.out.println("enter a fifth number:");
        int N5=sc.nextInt();

        int sum =(N1+N2+N3+N4+N5);
        System.out.println("Average is ="+sum/5);

    }
}
//output =
//enter a first number:
//        5
//enter a second number:
//        8
//enter a third number:
//        9
//enter a forth number:
//        8
//enter a fifth number:
//        6
//Average is =7