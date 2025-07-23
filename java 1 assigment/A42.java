public class A42 {
     public static void main(String[] args) {
        double radius = Math.sqrt(5 * 5 - 4 * 4); 
        double area = Math.PI * radius * radius;
        double cost = area * 10;

        System.out.println("Radius: " + radius + " cm");
        System.out.println("Polishing cost: ₹" + cost);
    }
}
