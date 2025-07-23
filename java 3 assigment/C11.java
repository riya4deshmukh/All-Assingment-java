 import java.util.Scanner;
class Test{
    public static void main (String [] args){
        Scanner sc=new Scanner (System.in);

        System.out.println("Enter the age:");
        int age=sc.nextInt();

        System.out.println("Enter the sex (M/F):");
        char sex=sc.next().charAt(0);

        System.out.println("Enter the Married status (Y/N):");
        char status=sc.next().charAt(0);

        if(sex == 'F' || sex == 'f') {
            System.out.println("work on urban area:");
        } else if(sex == 'M' || sex == 'm') {
            if(age >= 20 && age <= 40)
                System.out.println("May work on anywhere.");
            else if(age > 40 && age <= 60)
                System.out.println("Will work in urban areas only.");
            else
                System.out.println(" Invalid age input.");
        }
    }
}