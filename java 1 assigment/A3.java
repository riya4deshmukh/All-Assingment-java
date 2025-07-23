public class A3 {
 
    public static void main(String[] args) {
        int tileLength = 13;
        int tileBreadth = 7;
        int roomLength = 520;
        int roomBreadth = 140;

        int tileArea = tileLength * tileBreadth;
        int roomArea = roomLength * roomBreadth;
        int numberOfTiles = roomArea / tileArea;

        System.out.println("total tiles: " + numberOfTiles);
    }
}

