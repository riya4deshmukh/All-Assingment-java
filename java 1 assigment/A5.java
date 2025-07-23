public class A5 {
  

    public static void main(String[] args) {
        int Costofrectangle = 1600;
        double ratepersquare  = 25.0;
        int length = 20;

       
    double area =  Costofrectangle / ratepersquare ; 

        double breadth = area / length;

         
        double perimeter = 2 * (length + breadth);

       
        System.out.println("Area of the park: " + area + " sq meters");
        System.out.println("Breadth of the park: " + breadth + " meters");
        System.out.println("Perimeter of the park: " + perimeter + " meters");
    }
}

