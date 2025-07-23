class Rectangle {`
    public static void main(String[] args) {
        int perimeter = 230, length = 70;
        
        int breadth = (perimeter / 2) - length;
        int area = length * breadth;

        System.out.println("Breadth: " + breadth);
        System.out.println("Area: " + area);
    }
}