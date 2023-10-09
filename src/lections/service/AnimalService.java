package lections.service;

import lections.models.Animal;
import lections.models.Pet;

public class AnimalService {
    public static void main(String[] args) {
        Pet pet1 = new Pet ("Котик");
        Pet pet2 = new Pet ("Cat");
        Animal animal2 = new Pet("Пёсик");
//        pet1.printTitle();

        Animal animal1 = new Animal("Птичка");
//        animal1.printTitle();
        print(animal1);
        print(pet1);


        print(animal2);

        pet1.setOwner("Алиса");

        System.out.println(pet1.getOwner());

        pet1.equals(pet2);
        System.out.println(pet1.equals(pet2));
        System.out.println(pet1);
    }

    public static void print(Animal fish){
        fish.printTitle();

    }

}
