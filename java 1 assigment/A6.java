public class A6 { 
 public static void main(String[] args) {
        int side1 = 10;
        int  side2= 9;
        int perimeter = 36;
        int side3=(perimeter* side1* side2);
        int semi=(perimeter/2);
        double area =Math.sqrt(semi*(semi-side1)*(semi-side2)*(semi-side3));
        System.out.println(side3);
        System.out.println(semi);
        System.out.println(area);

    }
}
