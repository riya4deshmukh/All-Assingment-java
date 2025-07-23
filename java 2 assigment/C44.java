 import java.util.Scanner;

public class C44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (ch == '+')
            System.out.println("Sum: " + (a + b));
        else if (ch == '>')
            System.out.println((a > b) ? "First is greater" : "Second is greater");
        else if (ch == '=')
            System.out.println((a == b) ? "Equal" : "Not equal");
        else
            System.out.println("Invalid choice");

        sc.close();
    }
}
