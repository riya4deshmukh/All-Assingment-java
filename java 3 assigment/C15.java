 import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the cost price of the bike: ");
        int cost = input.nextInt();
        double tax;

        if (cost > 100000)
            tax = cost * 0.15;
        else if (cost > 50000 && cost <= 100000)
            tax = cost * 0.10;
        else
            tax = cost * 0.05;

        System.out.println("Road tax to be paid: Rs " + tax);
    }
}
 