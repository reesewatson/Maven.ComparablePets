package io.zipcoder;

import java.util.*;
import java.util.stream.Stream;

public class Application {

    IOConsole ioConsole = new IOConsole(System.in, System.out);
    Map <String, String> petMap;
    String petType;
    String petName;
    Integer number;
    int i;

    public static void main(String[] args) {
        new Application().start();
    }

    public void start() {
         number = getNumber();

         int count = 0;
         while (count < number) {
             for (i = 0; i < number; i++) {
                 petType = getType();
                 petName = getName();
                 petMap = new TreeMap();
                 petMap.put(petType, petName);
                 getPetList();
                 toString();
                 count++;
             }
         }
    }

    public List<Pet> getPetList() {
        List<Pet> petList = new ArrayList<>();
        Pet pet = null;
        if (petMap.containsKey("dog")) {
            String dogname = (String) petMap.get(petType);
            pet = new Dog();
            pet.setName(dogname);
        } else if (petMap.containsKey("cat")) {
            String catname = (String) petMap.get(petType);
            pet = new Cat();
            pet.setName(catname);
        } else if (petMap.containsKey("gecko")) {
            String geckoname = (String) petMap.get(petType);
            pet = new Gecko();
            pet.setName(geckoname);
        } else if (petMap.containsKey("goldfish")) {
            String goldfishname = (String) petMap.get(petType);
            pet = new GoldFish();
            pet.setName(goldfishname);
        } else if (petMap.containsKey("guineapig")) {
            String guineapigname = (String) petMap.get(petType);
            pet = new GuineaPig();
            pet.setName(guineapigname);
        } else if (petMap.containsKey("parrot")) {
            String parrotname = (String) petMap.get(petType);
            pet = new Parrot();
            pet.setName(parrotname);
        }
        petList.add(pet);
        return petList;
    }

    public String toString() {

        Stream<Pet> stream = getPetList().stream();
        stream.forEach(s -> System.out.println(s));
        return String.valueOf(stream);
    }

    public Integer getNumber() {

        ioConsole.println("How many pets do you have?");
        Integer numberOfPets = ioConsole.getIntegerInput();
        return numberOfPets;
    }

    public String getType() {

        ioConsole.println("What type of pet is pet number " + (i+1) + "? [Dog, Cat, Gecko, GoldFish, GuineaPig, or Parrot]");
        String type = ioConsole.getStringInput().toLowerCase();
        return type;
    }

    public String getName() {

        ioConsole.println("What is the name of pet number " + (i+1) + "?");
        String name = ioConsole.getStringInput();
        return name;
    }
}


