package io.zipcoder;
import java.lang.Comparable;

public class GuineaPig extends Pet implements Comparable<Pet>{

    private String name;

    public GuineaPig() {
        super();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String speak() {
        return "Squeakety-squeak, squeakem!";
    }

    @Override
    public String toString() {
        GuineaPig guineaPig = new GuineaPig();
        return "This GuineaPig's name is " + name + " .\n" +
                "When " + name + " speaks, he/she says, " + guineaPig.speak();
    }

    @Override
    public int compareTo(Pet o) {
        return 0;
    }
}
