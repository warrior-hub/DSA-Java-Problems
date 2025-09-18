/*
Question:
Car class banao with color and speed. 
Add displayInfo() method. 
Create 2 objects aur info print karo.
*/

class Car {
    // Instance variables
    String color;
    int speed;

    // Constructor to initialize color and speed
    Car(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }

    // Method to display car information
    void displayInfo() {
        System.out.println("Car color: " + color + ", Speed: " + speed + " km/h");
    }
}

public class Problem_56 {
    public static void main(String[] args) {
        // Creating two Car objects with different color and speed
        Car cr1 = new Car("Red", 120);
        Car cr2 = new Car("Blue", 100);

        // Display information of both cars
        cr1.displayInfo();
        cr2.displayInfo();
    }
}
