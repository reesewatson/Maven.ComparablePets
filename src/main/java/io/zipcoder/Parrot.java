package io.zipcoder;
import java.lang.Comparable;

public class Parrot extends Pet implements Comparable<Pet>{

    private String name;

    public Parrot() {
        super();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String speak() {
        return "Chirpety-chirp, Polly wanna cracker?";
    }

    @Override
    public String toString() {
        Parrot parrot = new Parrot();
        return "This Parrot's name is " + name + " .\n" +
                "When " + name + " speaks, he/she says, " + parrot.speak();
    }

    @Override
    public int compareTo(Pet o) {
        return 0;
    }
}
