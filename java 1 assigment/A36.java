public class A36 {
       public static void main(String[] args) {
        double diameter = 15, height = 7;
        double r = diameter / 2;

        double area = 2 * Math.PI * r * (r + height);

        System.out.println("Surface area: " + area + " m²");
    }
}
