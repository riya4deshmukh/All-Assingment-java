 import java.util.Scanner;

public class C34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == b && b == c)
            System.out.println("Equilateral triangle");
        else if (a == b || b == c || a == c)
            System.out.println("Isosceles triangle");
        else
            System.out.println("Scalene triangle");

        sc.close();
    }
}
