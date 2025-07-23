public class A21 {
    public static void main(String[] args) {
        int brickVolume = 15 * 8 * 5; // cm³

        int wallLength = 15 * 100;
        int wallBreadth = 10 * 100;
        int wallHeight = 8 * 100;
        int wallVolume = wallLength * wallBreadth * wallHeight; // cm³

        int numberOfBricks = wallVolume / brickVolume;

        System.out.println("Number of bricks needed: " + numberOfBricks);
    }
}
