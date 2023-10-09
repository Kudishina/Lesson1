package lections.models;

public class Cat {
    private String name;
    private int age;
    private String toy;
    private String tasty;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getToy() {
        return toy;
    }

    public void setToy(String toy) {
        this.toy = toy;
    }

    public String getTasty() {
        return tasty;
    }

    public void setTasty(String tasty) {
        this.tasty = tasty;
    }

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

    public Cat (String name, int age){
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

    public void speak() {
    }

    public void tell() {
    }
}
