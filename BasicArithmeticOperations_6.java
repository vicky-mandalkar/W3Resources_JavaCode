package W3resource.com;
import java.util.Scanner;
public class BasicArithmeticOperations_6 {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);


        System.out.print("Input first number: ");

        int num1 = in.nextInt();

        System.out.print("Input second number: ");
        int num2 = in.nextInt();

        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));

        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));

        System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));

        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));

    }
}
//output=
//Input first number: 12
//Input second number: 23
//        12 + 23 = 35
//        12 - 23 = -11
//        12 x 23 = 276
//        12 / 23 = 0

