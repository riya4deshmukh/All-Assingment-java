  import java.util.Scanner;

public class C7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Total classes held: ");
        int total = sc.nextInt();

        System.out.print("Classes attended: ");
        int attended = sc.nextInt();

        if (total <= 0 || attended < 0 || attended > total) {
            System.out.println("Invalid input!");
        } else {
            double percent = attended * 100.0 / total;
            System.out.printf("Attendance: %.2f%%%n", percent);

            if (percent >= 75.0) {
                System.out.println("Eligible to sit for the exam.");
            } else {
                System.out.println("Not eligible (attendance < 75%).");
            }
        }

        sc.close();
    }
}