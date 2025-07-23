public class A38 {
     public static void main(String[] args) {
        double diameter = 12;
        double r = diameter / 2;
        double h = 9;

        double area = 2 * Math.PI * r * (r + h);

        System.out.println("Surface area: " + area + " cm²");
    }
}
