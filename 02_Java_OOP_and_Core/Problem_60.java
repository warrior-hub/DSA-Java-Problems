// Q: Create a Rectangle class with length and breadth. 
//    Write a method area() and use multiple objects to find areas of different rectangles.

public class Problem_60 {
    public static void main(String[] args) {
        // First rectangle
        Rectangle r1 = new Rectangle();
        r1.length = 30;
        r1.breadth = 20;
        r1.area();

        // Second rectangle
        Rectangle r2 = new Rectangle();
        r2.length = 15;
        r2.breadth = 10;
        r2.area();

        // Third rectangle
        Rectangle r3 = new Rectangle();
        r3.length = 25;
        r3.breadth = 12;
        r3.area();
    }
}

class Rectangle {
    int length;
    int breadth;

    // Method to calculate and print area
    void area() {
        int area = length * breadth;
        System.out.println("Area of rectangle: " + area);
    }
}
