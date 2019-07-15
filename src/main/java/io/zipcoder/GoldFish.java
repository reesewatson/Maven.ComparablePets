package io.zipcoder;
import java.lang.Comparable;

public class GoldFish extends Pet implements Comparable<Pet>{

    private String name;

    public GoldFish() {
        super();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String speak() {
        return "Bloop, bloop, bloop!";
    }

    @Override
    public String toString() {
        GoldFish goldFIsh = new GoldFish();
        return "This GoldFish's name is " + name + " .\n" +
                "When " + name + " speaks, he/she says, " + goldFIsh.speak();
    }

    @Override
    public int compareTo(Pet o) {
        return 0;
    }
}
