import java.util.Scanner;
class A18{
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("stu 1: ");
       int s1 = sc.nextInt();

       System.out.print("stu 2: ");
       int s2 = sc.nextInt();

        System.out.print("stu3: ");
        int s3 = sc.nextInt();

        System.out.print(" Stu 4: ");
        int s4 = sc.nextInt();

        System.out.print("Stu 5: ");
         int s5 = sc.nextInt();

       int total = s1 + s2 + s3 + s4 + s5;
       float percent= (total / 5.0f); 

        System.out.println("Total student = " + total);
        System.out.println("percent = " + percent+ "%");
    }
}

   
        


