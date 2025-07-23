 import java.util.Scanner;

public class C31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice = sc.next().charAt(0);

        if (choice == 'c' || choice == 'C') {
            double f = sc.nextDouble();
            double c = (f - 32) * 5 / 9;
            System.out.println("Celsius: " + c);
        } else if (choice == 'f' || choice == 'F') {
            double c = sc.nextDouble();
            double f = (c * 9 / 5) + 32;
            System.out.println("Fahrenheit: " + f);
        } else {
            System.out.println("Invalid choice");
        }

        sc.close();
    }
}
