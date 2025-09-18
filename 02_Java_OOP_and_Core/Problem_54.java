public class Problem_54 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Prince";
        s1.rollNo = 101;

        Student s2 = new Student();
        s2.name = "Ravi";
        s2.rollNo = 102;
        s1.study();
        s2.study();
    }

}

class Student {
    String name;
    int rollNo;

    void study() {
        System.err.println(name + " is studying");
    }

}
