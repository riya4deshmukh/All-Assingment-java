 import java.util.Scanner;

public class C37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num % 5 == 0 && num % 11 == 0)
            System.out.println("Divisible by 5 and 11");
        else
            System.out.println("Not divisible by 5 and 11");

        sc.close();
    }
}
