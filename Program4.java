public class Program4 {
    public static void main(String[] args) {
        // Single Inheritance
        Dog dog = new Dog();
        dog.eat();
        dog.bark();

        // Multilevel Inheritance
        BabyDog babyDog = new BabyDog();
        babyDog.eat();
        babyDog.bark();
        babyDog.weep();

        // Hierarchical Inheritance
        Cat cat = new Cat();
        cat.eat();
        cat.meow();

        // Multiple Inheritance using interfaces
        Duck duck = new Duck();
        duck.eat();
        duck.fly();
        duck.swim();
    }
}

// Base class for single and multilevel inheritance
class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

// Single Inheritance: Dog inherits from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}

// Multilevel Inheritance: BabyDog inherits from Dog
class BabyDog extends Dog {
    void weep() {
        System.out.println("Weeping...");
    }
}

// Hierarchical Inheritance: Cat also inherits from Animal
class Cat extends Animal {
    void meow() {
        System.out.println("Meowing...");
    }
}

// Interfaces for multiple inheritance
interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

// Multiple Inheritance: Duck implements both interfaces and extends Animal
class Duck extends Animal implements Flyable, Swimmable {
    public void fly() {
        System.out.println("Flying...");
    }

    public void swim() {
        System.out.println("Swimming...");
    }
}

// This program demonstrates various types of inheritance in Java.
// It shows single, multilevel, hierarchical inheritance, and multiple inheritance using interfaces,
// illustrating how classes can inherit properties and behaviors from parent classes or interfaces.