package modifierStatic;

public class TestStatic {
    public static void main(String args[]) {
        Student.change(); //calling change method

        //creating objects
        Student s1 = new Student(111, "nam");
        Student s2 = new Student(222, "Khanh");
        Student s3 = new Student(333, "Nam");
        Student s4 = new Student();
        s4.setName("duc anh");
        s4.setClasses("C1022i1");
        //calling display method
        s1.display();
        s2.display();
        s3.display();
        s4.display();
    }
}
