
public class Pet {

    private String petName, ownerName, color;
    protected int sex;

    public static final int MALE = 1;
    public static final int FEMALE = 2;
    public static final int SPAYED = 3;
    public static final int NEUTERED = 4;

    public Pet(String petName, String ownerName, String color) {
        this.petName = petName;
        this.ownerName = ownerName;
        this.color = color;
    }

    public String getPetName() {
        return petName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getColor() {
        return color;
    }

    public void setSex(int id) {

        if (id == MALE) {
            sex = MALE;
        }
        if (id == FEMALE) {
            sex = FEMALE;
        }
        if (id == SPAYED) {
            sex = SPAYED;
        }
        if (id == NEUTERED) {
            sex = NEUTERED;
        }
    }

    public String getSex() {

        if (sex == MALE) {
            return "MALE";
        }
        if (sex == FEMALE) {
            return "FEMALE";
        }
        if (sex == SPAYED) {
            return "SPAYED";
        }
        if (sex == NEUTERED) {
            return "NEUTERED";
        }
        return "";
    }

    @Override
    public String toString() {

        return getPetName() + " owned by " + getOwnerName() + "\nColor: " + getColor() + "\nSex: " + getSex();

    }
    public static void main(String [] args){
    
        Pet pet = new Pet("Spot", "Mary", "BLACK AND WHITE");
        pet.setSex(MALE);
        System.out.println(pet);
    
    }

}
