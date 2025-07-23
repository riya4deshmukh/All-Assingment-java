 import java.util.Scanner;
class Q3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your salary : ");
        float s = sc.nextFloat();
        System.out.print("enter your service : ");
        float n = sc.nextFloat();
        if(n>5){
         float netbonus = s *( 5.0f / 100 );
         float amount = s + netbonus;
        System.out.println("your salary is according to your service is :  "+amount );
        }
        else
        System.out.println("you are not eligible for bonus : ");
    }
}