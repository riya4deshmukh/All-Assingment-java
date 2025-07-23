public class A19 {
    public static void main(String[] args) {
        int cubeVolume = 7 * 7 * 7;
        int cuboidVolume = 7 * 4 * 8;

        if (cubeVolume > cuboidVolume) {
            System.out.println("Cube has more volume: " + cubeVolume + " cm³");
        } else {
            System.out.println("Cuboid has more volume: " + cuboidVolume + " cm³");
        }
    }
}
