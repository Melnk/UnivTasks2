package org.example.HomeWork4.Task4;

public class ZooManagement {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Lion lion = new Lion();
        Elephant elephant = new Elephant();
        Monkey monkey = new Monkey();

        zoo.addAnimal(lion);
        zoo.addAnimal(elephant);
        zoo.addAnimal(monkey);

        System.out.println("Animal sounds:");
        zoo.makeAllSounds();

        System.out.println("Feeding animals:");
        zoo.feedAll("meat");
        zoo.feedAll("fruits");

        System.out.println("Special actions:");
        lion.hunt();
        elephant.playWater();
        monkey.swing();
    }
}
