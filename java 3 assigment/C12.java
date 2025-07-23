 import java.util.Scanner;

class ReverseDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev = (num % 10) * 1000 + ((num / 10) % 10) * 100 + ((num / 100) % 10) * 10 + (num / 1000);
        System.out.println(rev);
    }
}
