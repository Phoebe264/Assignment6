
public class Cat extends Pet implements Boardable {

    int startDay, startMonth, startYear;
    int endDay, endMonth, endYear;
    private String hairLength;

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
            return true;
        }
        if (month >= startMonth && month <= endMonth) {
            return true;
        }
        if (day >= startDay && day <= endDay) {
            return true;
        }
        return false;
    }

    public Cat(String petName, String ownerName, String Color, String hairLength) {

        super(petName, ownerName, Color);
        this.hairLength = hairLength;

    }

    public String getHairLength() {
        return hairLength;
    }

    @Override
    public String toString() {

        return "CAT:\n" + super.toString() + "\nHair: " + getHairLength();

    }

    public static void main(String[] args) {

        Cat cat = new Cat("Tom", "Bob", "Black", "Short");
        cat.setSex(SPAYED);
        System.out.println(cat);
        cat.setBoardStart(11, 20, 2020);
        cat.setBoardEnd(11, 30, 2020);

        System.out.println("Boarding: " + cat.boarding(11, 25, 2020));

    }
}
