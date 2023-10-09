package practice.models;

public class Pet {
    private String owner;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Pet(String owner) {
        this.owner = owner;

    }

    public Pet (){

    }
    public void printOwner() {
        System.out.println(" Хозяина питомца зовут: " + this.owner);
    }

    @Override
    public String toString() {
        return "Pet{" +
                "owner='" + owner + '\'' +
                '}';
    }

    public int hashCode() {
        int owner = 0;
        if (this.owner != null){
            owner = this.owner.hashCode();
        }
        return 31 * owner;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || object.getClass() != Pet.class) {
            return false;
        }
        Pet pet2 = (Pet)object;
        if ((this.owner != null && !this.owner.equals(pet2.owner)) || (this.owner == null && pet2.owner != null)) {
            return false;
        }
        return true;
    }
}

