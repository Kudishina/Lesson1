package lections.models;

import java.util.Objects;

public class Pet extends Animal {

    private String owner;

    public Pet(String title) {
        super(title);
    }

    public void printOwner() {
        System.out.println("Хозяин этого питомца - " + this.owner);
    }

    public void printTitle() {
        System.out.println("Этот питомец - " + this.title);
    }

    public String getOwner(){
        return this.owner;
    }

    public String getTitle(){
        return this.title;
    }

    public void setOwner (String owner){
        this.owner = owner;
    }

    public void setTitle(String title){
        this.title = title;
    }


    @Override
    public boolean equals(Object object) {


        if (object == null){                                    //Если сравниваем объект с null возвращаем false
            return false;
        }
        if (this == object) {                                   //Сравниваем объект сам с собой
            return true;
        }
        if (!(object instanceof Pet)) {                         //Проверяет что объeкт принадлежит классу Pet
            return false;
        }
        Pet pet = (Pet) object;                                 //Превращаем наш object в pet
        if (!this.title.equals(pet.getTitle())) {                    //Сравниваем поля title
            return false;
        }
        if (!this.owner.equals(pet.getOwner())) {                    //Сравниваем поля owner
            return false;
        }
        return true;                                            //Если все if не выполнились, возвращаем true
    }

    @Override
    public int hashCode() {
        return owner.hashCode() + title.hashCode();
    }

    public String toString() {
        return "Этот питомец любит играть с игрушками - " + this.title;
    }
}
