package lections.service;

import lections.models.Cat;

public class CatService {
    public static void main(String[] args) {
        Cat cutie = new Cat("Лея", "Рыбка", 3);
        cutie.setTasty("Sheba");
        Cat little = new Cat("Лейкоцит", "Мышка");
//        little.tasty = "Sheba";
//        little.age = 3;
        Cat whickey = new Cat ("Булочка", "Мячик", 2, "Sheba");
//        whickey.age = 3;



        System.out.println(cutie.getName());
        System.out.println(cutie.getToy());

        little.voice();
        cutie.voice();
        whickey.play();
        cutie.eat();
        little.eat("Красную рыбу");
        little.old();
        little.eat();


        little.getTasty().getBytes();

    }
}
