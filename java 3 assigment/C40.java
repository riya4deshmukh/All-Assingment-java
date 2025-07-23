 import java.util.Scanner;

public class C40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cost = sc.nextInt();
        int sell = sc.nextInt();

        if (sell > cost)
            System.out.println("Profit: " + (sell - cost));
        else if (cost > sell)
            System.out.println("Loss: " + (cost - sell));
        else
            System.out.println("No Profit No Loss");

        sc.close();
    }
}
