 import java.util.Scanner;
class Q4{
public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
        System.out.println("enter marks of english :");
        float e = sc.nextFloat();
         System.out.println("enter marks of maths :");
        float m = sc.nextFloat();
         System.out.println("enter marks of science :");
        float s = sc.nextFloat();
         System.out.println("enter marks of hindi :");
        float h = sc.nextFloat();
         System.out.println("enter marks of bst :");
        float bst = sc.nextFloat();
        float add = (e + m + s + h + bst );
        float percentage = (add / 500) * 100;
        System.out.println("the percentage is  "+ percentage );
        if(percentage<25){
            System.out.println("your fail ");
        }        
        else if(percentage <= 45)
        System.out.println("you need improvement  ");

        else if(percentage <=60)
        System.out.println("pass but do hardwork ");

        else if(percentage<=80)
        System.out.println("your are very good ");

        else
        System.out.println("Excellent ");

    }
}
 