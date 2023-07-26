package models;

public class Rabbit extends Animal{
    public Rabbit(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Rabbit{" +
                "name='" + name + '\'' +
                ", age=" + age*2 +
                '}';
    }

    @Override
    public String sayHello() {
        return "rab rab";
    }

    @Override
    public String move() {
        return "hop hop hop";
    }
}
