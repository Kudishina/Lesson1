package practice.models;

public class Dog extends Pet {
    private String name;
    private int age;
    private String toy;
    private String tasty;
    private String owner;

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

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Dog(String name, String toy, int age, String tasty, String owner) {
        super();
        this.name = name;
        this.toy = toy;
        this.age = age;
        this.tasty = tasty;
        this.owner = owner;
    }

    public void voice() {
        System.out.println("Пёсик с именем " + this.name + " Сказал гав");
    }

    public void play() {
        System.out.println("Пёсик с именем " + this.name + " Играет в свою любимую игрушку " + this.toy);
    }

    public void eat() {
        System.out.println("Пёсик с именем " + this.name + " Ест любимую вкусняшку " + this.tasty);
    }

    public void old() {
        System.out.println("Пёсику с именем " + this.name + " " + this.age);
    }

    public String toString() {
        return "Пёсика зовут - " + this.name + " , возраст пёсика - " + this.age + " , его любимая игрушка - " + this.toy + " , его любимая вкусняшка - " + this.tasty + " , Его хозяин - " + this.owner;

    }


    public int hashCode() {
        int name = 0;
        if (this.name != null) {
            name = this.name.hashCode();
        }
        int toy = 0;
        if (this.toy != null) {
            toy = this.toy.hashCode();
        }
        int tasty = 0;
        if (this.tasty != null) {
            tasty = this.tasty.hashCode();
        }
        int owner = 0;
        if (this.owner != null){
            owner = this.owner.hashCode();
        }
        return 31 * (name + this.age + toy + tasty + owner);

    }

    public boolean equals(Object dog) {
        if (this == dog) {
            return true;
        }
        if (dog == null || dog.getClass() != Dog.class) {
            return false;
        }
        Dog dog2 = (Dog) dog;
        if ((this.name != null && !this.name.equals(dog2.name)) || (this.name == null && dog2.name != null)) {
            return false;
        }
        if (this.age != dog2.age) {
            return false;
        }
        if ((this.toy != null && !this.toy.equals(dog2.toy)) || (this.toy == null && dog2.toy != null)) {
            return false;
        }
        if ((this.tasty != null && !this.tasty.equals(dog2.tasty)) || (this.tasty == null && dog2.tasty != null)) {
            return false;
        }
        if ((this.owner != null && !this.owner.equals(dog2.owner)) || (this.owner == null && dog2.owner != null)) {
            return false;
        }
        return true;

    }
}




