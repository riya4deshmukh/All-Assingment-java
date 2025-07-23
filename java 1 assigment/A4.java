public class A4 {
    public static void main(String[] args) {

        double length = 300.0;
        double width = 150.0;

        double rateSqM = 6.0;

        double area = length * width;

        double areaSqM = area / 100.0;

        double totalCost = areaSqM * rateSqM;

        System.out.println("Length of the plot: " + length + " m");
        System.out.println("Width of the plot: " + width + " m");
        System.out.println("Area of the plot: " + area + " sq m");
        System.out.println("Cost per hundred square meters: $" + rateSqM);
        System.out.println("Total cost of tiling: $" + totalCost);
    }
}
