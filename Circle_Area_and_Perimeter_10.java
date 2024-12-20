package W3resource.com;

import java.util.Scanner;

public class Circle_Area_and_Perimeter_10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a redius:");
        double r= sc.nextDouble();

        double perimeter=2*Math.PI*r;

        double area=Math.PI*r*r;
        System.out.println("Perimeter is ="+perimeter);
        System.out.println("Area is ="+area);

    }
}
//output =
//enter a redius:
//        5
//Perimeter is =31.41592653589793
//Area is =78.53981633974483
