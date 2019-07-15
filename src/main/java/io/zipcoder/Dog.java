package io.zipcoder;
import java.lang.Comparable;

public class Dog extends Pet implements Comparable<Pet>{

    private String name;

    public Dog() {
        super();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String speak() {
        return "Barkety-bark, bark!";
    }

    @Override
    public String toString() {
        Dog dog = new Dog();
        return "This Dog's name is " + name + " .\n" +
                "When " + name + " speaks he/she says " + dog.speak();
    }

    @Override
    public int compareTo(Pet o) {
        return 0;
    }
}