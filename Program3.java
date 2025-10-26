public class Program3 {
    public static void main(String[] args) {
        // Constructor overloading examples
        Person person1 = new Person();
        Person person2 = new Person("John");
        Person person3 = new Person("Jane", 25);
        Person person4 = new Person("Mike", 30, "Engineer");

        person1.display();
        person2.display();
        person3.display();
        person4.display();
    }
}

class Person {
    private String name;
    private int age;
    private String occupation;

    // Default constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
        this.occupation = "Unemployed";
    }

    // Constructor with name
    public Person(String name) {
        this.name = name;
        this.age = 0;
        this.occupation = "Unemployed";
    }

    // Constructor with name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.occupation = "Unemployed";
    }

    // Constructor with name, age, and occupation
    public Person(String name, int age, String occupation) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Occupation: " + occupation);
    }
}

// This program demonstrates constructor overloading in Java.
// - Constructor Overloading: The `Person` class has multiple constructors, each with a different set of parameters.
// - Object Initialization: This allows `Person` objects to be created with varying levels of detail, from a default state to fully specified.