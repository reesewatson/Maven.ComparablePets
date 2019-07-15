package io.zipcoder;
import java.lang.Comparable;

public class Gecko extends Pet implements Comparable<Pet>{

    private String name;

    public Gecko() {
        super();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String speak() {
        return "Click, click.";
    }

    @Override
    public String toString() {
        Gecko gecko = new Gecko();
        return "This Gecko's name is " + name + " .\n" +
                "When " + name + " speaks, he/she says, " + gecko.speak();
    }

    @Override
    public int compareTo(Pet o) {
        return 0;
    }
}
