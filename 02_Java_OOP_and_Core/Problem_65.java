// Q: Create a class Dog with a constructor that prints "Dog object created". 
//    Create an object to see output.

public class Problem_65 {
    public static void main(String[] args) {
        // Creating a Dog object
        Dog myDog = new Dog();  // Constructor will be called automatically
    }
}

class Dog {
    // Constructor
    Dog() {
        System.out.println("Dog object created");
    }
}
