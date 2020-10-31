
public class Dog extends Pet implements Boardable {

    int startDay, startMonth, startYear;
    int endDay, endMonth, endYear;
    private String size;

    @Override
    public void setBoardStart(int month, int day, int year) {

        startDay = day;
        startMonth = month;
        startYear = year;

    }

    @Override
    public void setBoardEnd(int month, int day, int year) {

        endDay = day;
        endMonth = month;
        endYear = year;

    }

    @Override
    public boolean boarding(int month, int day, int year) {
        if (year >= startYear && year <= endYear) {
            if (month >= startMonth && month <= endMonth) {
                if (day >= startDay && day <= endDay) {
                    return true;
                }
            }
        }

        return false;
    }

    public Dog(String petName, String ownerName, String Color, String size) {

        super(petName, ownerName, Color);
        this.size = size;

    }

    public String getSize() {
        return size;
    }

    public String toString() {

        return "DOG:\n" + super.toString() + "\nSize: " + getSize();

    }

    public static void main(String[] args) {

        Dog dog = new Dog("Spot", "Susan", "White", "medium");
        dog.setSex(SPAYED);
        dog.setBoardStart(11, 20, 2020);
        dog.setBoardEnd(11, 30, 2020);
        System.out.println(dog);

        System.out.println("Boarding: " + dog.boarding(11, 25, 2020));

    }
}
