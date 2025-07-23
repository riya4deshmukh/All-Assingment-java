public class A11 {
    public static void main(String[] args) {
        int ratioBase = 8, ratioHeight = 5;
        int area = 320;

        double k = Math.sqrt((2.0 * area) / (ratioBase * ratioHeight));

        double base = ratioBase * k;
        double height = ratioHeight * k;

        System.out.println("Base: " + base + " m");
        System.out.println("Height: " + height + " m");
    }
}
