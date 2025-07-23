public class A24 {
    public static void main(String[] args) {
        double brickVolume = 25 * 10 * 7.5; // cm³
        double wallVolume = 2000 * 100 * 75; // convert to cm³

        int numberOfBricks = (int)(wallVolume / brickVolume);
        double cost = (numberOfBricks / 1000.0) * 900;

        System.out.println("Bricks needed: " + numberOfBricks);
        System.out.println("Total cost: ₹" + cost);
    }
}
