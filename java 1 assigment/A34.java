public class A34 {
    
    public static void main(String[] args) {
        int base1 = 128, base2 = 92, height = 40;
        int walkway = 4;

        double area = 0.5 * (base1 + base2) * height;
        double finalArea = area + (walkway * (base1 + base2) / 2.0);

        System.out.println("Total area with walkway: " + finalArea + " m²");
    }
}
