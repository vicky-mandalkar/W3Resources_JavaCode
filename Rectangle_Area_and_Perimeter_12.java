package W3resource.com;

import java.util.Scanner;

public class Rectangle_Area_and_Perimeter_12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter a width number:");
        double width=sc.nextDouble();
        System.out.println("enter a height number:");
        double height =sc.nextDouble();

        double Perimeter=2*(height+width);
        double Area=width*height;

        System.out.println("perimater of rectangle="+Perimeter);
        System.out.println("Area of rectangle="+Area);
    }
}
//output=
//enter a width number:
//        6.5
//enter a height number:
//        5.4
//perimater of rectangle=23.8
//Area of rectangle=35.1
