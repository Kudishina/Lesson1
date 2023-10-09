package practice.service;

import practice.models.Dog;
import practice.models.Cat;
import practice.models.Pet;

public class AnimalService {
    public static void main(String[] args) {
        Pet cat = new Cat("Лея", null, 2, "Sheba", "Алиса");
        Cat cat2 = new Cat("Лея", null, 2, "Sheba", "Алиса");

        Pet pet = new Pet ("Алиса");
        Pet pet2 = new Pet ("Дима");

        Pet dog = new Dog(null, "Косточка", 3, "Сыр", "Алиса");
        Dog dog2 = new Dog(null, "Косточка", 3, "Сыр", "Алиса");

        System.out.println(cat.hashCode());
        System.out.println(cat2.hashCode());

        System.out.println(cat.getOwner());
        System.out.println(cat2.getOwner());
        System.out.println(cat2.getName());



        System.out.println(dog.getOwner());
//        System.out.println(dog);
//        System.out.println(dog2);

        System.out.println(dog2.getOwner());
        System.out.println(dog2.getName());

        System.out.println(pet.getOwner());
        System.out.println(pet2.getOwner());
        System.out.println(pet.getOwner());
    }

}
