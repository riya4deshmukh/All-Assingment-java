 import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;

        System.out.print("Enter first number (a): ");
        a = sc.nextInt();

        System.out.print("Enter second number (b): ");
        b = sc.nextInt();

        a = a ^ b;
        b = a  ^b;
        a = a ^ b;

        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
