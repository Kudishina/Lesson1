package practice;

public class Cat {
    public String name;
    public int age;
    public String toy;
    public String tasty;

    public Cat(String name, String toy, int age) {
        this.name = name;
        this.toy = toy;
        this.age = age;
    }
    public Cat(String name, String toy, int age, String tasty) {
        this.name = name;
        this.toy = toy;
        this.age = age;
        this.tasty = tasty;
    }

    public Cat(String name, String toy) {
        this.name = name;
        this.toy = toy;
    }

    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void voice(){
        System.out.println("Котик с именем " + this.name + " Сказал мяу");
    }

    public void play(){
        System.out.println("Котик с именем " + this.name + " Играет в свою любимую игрушку " + this.toy);
    }

    public void eat(){
        System.out.println("Котик с именем " + this.name + " Ест любимую вкусняшку " + this.tasty);
    }

    public void eat(String food){
        System.out.println("Котик с именем " + this.name + " Ест  " + food);
    }

    public void old(){
        System.out.println("Котику с именем " + this.name + " " + this.age);
    }

    }
