public class A23 {
     public static void main(String[] args) {
        int cube = 3;
        int cartonVolume = 15 * 9 * 12;
        int cubeVolume = cube * cube * cube;

        int number = cartonVolume / cubeVolume;

        System.out.println("Number of cubical boxes: " + number);
    }
}
