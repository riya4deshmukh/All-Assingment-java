public class A37 {
    public static void main(String[] args) {
        double area = 149, h = 6;
 
        for (double r = 1; r <= 10; r += 0.01) {
            double sa = 2 * Math.PI * r * (r + h);
            if (Math.abs(sa - area) < 0.5) {
                System.out.println("Radius ≈ " + r + " cm");
                System.out.println("Diameter ≈ " + (2 * r) + " cm");
                break;
            }
        }
    }
}
