// Q: Create a class Counter with a static variable count to track number of objects created.
//    Increment it in the constructor and display count.

public class Problem_63 {
    public static void main(String[] args) {
        // Creating objects
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        // Display total count
        Counter.displayCount();
    }
}

class Counter {
    static int count = 0;  // Static variable to track number of objects

    // Constructor
    Counter() {
        count++;  // Increment count whenever a new object is created
    }

    // Static method to display count
    static void displayCount() {
        System.out.println("Total objects created: " + count);
    }
}
