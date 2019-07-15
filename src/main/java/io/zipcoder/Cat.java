package io.zipcoder;
import java.lang.Comparable;

public class Cat extends Pet implements Comparable<Pet> {

    private String name;

    public Cat() {
        super();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String speak() {
        return "Purrrrrr!";
    }

    @Override
    public String toString() {
        Cat cat = new Cat();
        return "This pet's name is " + name + " .\n" +
                "When " + name + " speaks, he/she says, " + cat.speak();
    }

    @Override
    public int compareTo(Pet o) {
        return 0;
    }
}
