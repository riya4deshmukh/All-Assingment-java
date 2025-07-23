public class A33 {
    public static void main(String[] args) {
        int length = 30, height = 20;
        int path1 = 3, path2 = 4;

        int totalArea = length * height;
        int pathArea = (path1 * height) + (path2 * length) - (path1 * path2);

        int usableArea = totalArea - pathArea;

        System.out.println("Usable garden area: " + usableArea + " m²");
    }
}
