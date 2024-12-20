package W3resource.com;

public class Swapping_two_variables_15 {
    public static void main(String[] args) {
        int a,b,temp;
        a=10;
        b=30;
        System.out.println("Before Swapping: a,b ="+ a +","+b);

        temp=a;
        a=b;
        b=temp;

        System.out.println("After Sweapping : a,b =" +a+","+b);
    }
}
//output=
//Before Swapping: a,b =10,30
//After Sweapping : a,b =30,10
