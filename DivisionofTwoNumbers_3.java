package W3resource.com;

import java.util.Scanner;

public class DivisionofTwoNumbers_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number:");
        int num=sc.nextInt();
        System.out.print("divided by :");
        int divby = sc.nextInt();
        int result=num/divby;
        System.out.println("result is :"+result);
    }
}
