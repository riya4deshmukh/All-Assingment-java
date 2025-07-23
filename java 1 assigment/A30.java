public class A30 {
     public static void main(String[] args) {
        int tileArea = 5 * 8;
        int floorArea = 200 * 400;

        int numberOfTiles = floorArea / tileArea;

        System.out.println("Tiles needed: " + numberOfTiles);
    }
}
