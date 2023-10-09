package lections.models;

public class Animal {
    public String title;
    public boolean fur;

    public Animal(String title) {
        this.title = title;
    }



    public Animal() {
    }

    public void printTitle(){
        System.out.println(this.title);
    }
}
