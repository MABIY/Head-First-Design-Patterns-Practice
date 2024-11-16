package strategy.version1;

import java.util.ArrayList;

/**
 * @author lh
 */
public class AnimalTest {

    public static void main(String[] args) {
        AnimalTest at = new AnimalTest();
        at.makeSomeAnimals();
    }

    void makeSomeAnimals() {
        Animal dog = new Dog();
        Animal cat = new Cat();
        // treat dogs and cats as their supertype, Animal
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(cat);
        animals.forEach(Animal::makeSound);
    }

    public abstract class Animal {
        abstract void makeSound();
    }

    public class Cat extends Animal {
        @Override
        void makeSound() {
            meow();
        }
        void meow() {
            System.out.println("Meow");
        }
    }

    public class Dog extends Animal {
        @Override
        void makeSound() {
            bark();
        }

        void bark() {
            System.out.println("Woof");
        }
    }

}
