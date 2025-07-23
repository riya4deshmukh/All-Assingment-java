public class A15 {
    public static void main(String[] args) {
        int shellyArea = 22 * 15;
        int rachelArea = 21 * 21;

        if (shellyArea > rachelArea) {
            System.out.println("Shelly's garden is bigger by " + (shellyArea - rachelArea) + " m²");
        } else {
            System.out.println("Rachel's garden is bigger by " + (rachelArea - shellyArea) + " m²");
        }
    }
}
