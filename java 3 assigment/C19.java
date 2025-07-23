  import java.util.Scanner;
public class C19 
{public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.print("1num: ");
        a = sc.nextInt();

        System.out.print(" 2num: ");
        b = sc.nextInt();

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After swap: a ,b= " + a+b);
    }
}
 
    
  
