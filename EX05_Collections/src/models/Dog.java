package models;

public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age*7 +
                '}';
    }

    @Override
    public String sayHello() {
        return "woof woof";
    }

    @Override
    public String move() {
        return "paw paw paw";
    }
}
