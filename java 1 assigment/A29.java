public class A29 {
     public static void main(String[] args) {
        int tileArea = 10 * 10;
        int floorArea = 800 * 900;

        int numberOfTiles = floorArea / tileArea;

        System.out.println("Tiles needed: " + numberOfTiles);
    }
}
