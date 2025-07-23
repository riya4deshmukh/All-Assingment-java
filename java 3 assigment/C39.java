import java.util.Scanner;

public class C39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();

        int[] notes = {2000, 500, 200, 100, 50, 20, 10, 5, 2, 1};

        for (int note : notes) {
            int count = amount / note;
            if (count > 0)
                System.out.println(note + " : " + count);
            amount %= note;
        }

        sc.close();
    }
}
