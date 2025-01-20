/*Create a Person class with a copy constructor that clones another person's attributes.
*/
class Person {
    private String name;
    private int age;
    
    //Parameterized constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Copy constructor
    Person(Person p) {
        this.name = p.name;
        this.age = p.age;
    }
}
public class ConstPerson {
    public static void main(String[] args) {
        Person p1 = new Person("John", 30);
        Person p2 = new Person(p1);
        System.out.println("Parameterized Constructor -  Name: " + p1.name + ", Age: " + p1.age);
        System.out.println("Copy constructor - Name: " + p2.name + ", Age: " + p2.age);
    }
}