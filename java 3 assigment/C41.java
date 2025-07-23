 import java.util.Scanner;

public class C41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int phy = sc.nextInt();
        int chem = sc.nextInt();
        int bio = sc.nextInt();
        int math = sc.nextInt();
        int comp = sc.nextInt();

        int total = phy + chem + bio + math + comp;
        double percent = total / 5.0;

        if (percent >= 90)
            System.out.println("Grade A");
        else if (percent >= 80)
            System.out.println("Grade B");
        else if (percent >= 70)
            System.out.println("Grade C");
        else if (percent >= 60)
            System.out.println("Grade D");
        else if (percent >= 40)
            System.out.println("Grade E");
        else
            System.out.println("Grade F");

        sc.close();
    }
}
