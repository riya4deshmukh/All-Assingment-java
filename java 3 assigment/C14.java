import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your percentage: ");
        int percent = input.nextInt();

        if (percent > 90)
            System.out.println("Grade: A");
        else if (percent > 80 && percent <= 90)
            System.out.println("Grade: B");
        else if (percent >= 60 && percent <= 80)
            System.out.println("Grade: C");
        else
            System.out.println("Grade: D");
    }
}
