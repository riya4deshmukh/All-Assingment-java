~public class A18 {
    public static void main(String[] args) {
        int length = 50, breadth = 30;
        int perimeter = 2 * (length + breadth);

        int totalDistance = perimeter * 10; // in meters
        double km = totalDistance / 1000.0;

        System.out.println("Total distance jogged: " + km + " km");
    }

}
