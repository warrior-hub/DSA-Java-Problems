// Q: Create a class Person with name, age, and Gender. 
//    Create an object of Person, set its attributes, and display the details using a method.

public class Problem_58 {
    public static void main(String[] args) {
        Person pr1 = new Person();
        pr1.name= "Prince";
        pr1.age =18;
        pr1.Gender="male";

        pr1.printPerson();
    }
}

class Person{
    String  name ;
    int age;
    String Gender ;

    void printPerson(){
        System.out.println("person name: "+name+" age: "+age+" Gender: "+Gender);
    }
}
