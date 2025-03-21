// Superclass: Animal
class Animal {
    // Attributes
    String name;
    int age;

    // Constructor
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display information
    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Overloaded method (polymorphism - overloading)
    void makeSound() {
        System.out.println("Animal makes a sound.");
    }

    void makeSound(String sound) {
        System.out.println("Animal makes a sound: " + sound);
    }
}

// Subclass: Dog
class Dog extends Animal {

    // Constructor
    Dog(String name, int age) {
        super(name, age);
    }

    // Overriding the displayInfo method
    @Override
    void displayInfo() {
        System.out.println("Dog's Name: " + name + ", Age: " + age);
    }

    // Overloading the makeSound method
    void makeSound(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Woof!");
        }
    }
}

// Subclass: Cat
class Cat extends Animal {

    // Constructor
    Cat(String name, int age) {
        super(name, age);
    }

    // Overriding the displayInfo method
    @Override
    void displayInfo() {
        System.out.println("Cat's Name: " + name + ", Age: " + age);
    }

    // Overloading the makeSound method
    void makeSound(boolean purring) {
        if (purring) {
            System.out.println("Purr...");
        } else {
            System.out.println("Meow!");
        }
    }
}

// Main class to demonstrate inheritance, overriding, and overloading
public class Main {
    public static void main(String[] args) {
        // Superclass object
        Animal animal = new Animal("Generic Animal", 5);
        animal.displayInfo();
        animal.makeSound();
        animal.makeSound("Roar");

        System.out.println();

        // Subclass: Dog
        Dog dog = new Dog("Buddy", 3);
        dog.displayInfo(); // Overridden method
        dog.makeSound();   // Inherited method
        dog.makeSound(3);  // Overloaded method

        System.out.println();

        // Subclass: Cat
        Cat cat = new Cat("Whiskers", 2);
        cat.displayInfo(); // Overridden method
        cat.makeSound();   // Inherited method
        cat.makeSound(true); // Overloaded method
    }
}
