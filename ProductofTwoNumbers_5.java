package W3resource.com;

import java.util.Scanner;

public class ProductofTwoNumbers_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter first number:");
        int N1=sc.nextInt();
        System.out.print("enter second number:");
        int N2 = sc.nextInt();
        int Product=N1*N2;
        System.out.println(N1+"*"+N2+"="+ Product);
    }
}

//output=
//enter first number:12
//enter second number:12
//        12*12=144