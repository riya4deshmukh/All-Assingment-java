import java.util.Scanner;

public class C28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                if (b != 0)
                    System.out.println(a / b);
                else
                    System.out.println("Division by zero");
                break;
            default:
                System.out.println("Invalid operator");
        }
        sc.close();
    }
}
