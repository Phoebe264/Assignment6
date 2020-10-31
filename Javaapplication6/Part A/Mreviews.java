
import java.util.ArrayList;

public class Mreviews implements Comparable {

    String title;
    ArrayList<Integer> ratings;

    public Mreviews(String title) {
        this.title = title;
        ratings = new ArrayList<>();
    }

    public Mreviews(String title, int r) {
        this.title = title;
        ratings = new ArrayList<>();
        ratings.add(r);
    }

    public void addRating(int r) {
        ratings.add(r);
    }

    public double aveRating() {
        double sum = 0;
        if (!ratings.isEmpty()) {
            for (Integer rating : ratings) {
                sum += rating;
            }
            return sum / ratings.size();
        }
        return sum;
    }

    @Override
    public int compareTo(Object obj) {
        Mreviews obj1 = (Mreviews) obj;
        return this.title.compareTo(obj1.title);
    }

    @Override
    public boolean equals(Object obj) {
        Mreviews obj1 = (Mreviews) obj;
        return this.title.equals(obj1.title);
    }

    public String getTitle() {

        return title;

    }

    public int numRating() {

        return ratings.size();

    }

    @Override
    public String toString() {
        String str = String.format("%.2f", aveRating());
        return title + ", average " + str + " out of " + ratings.size() + " ratings.";
    }

    public static void main(String[] args) {

        Mreviews movie = new Mreviews("Movie", 4);
        movie.addRating(4);
        movie.addRating(5);
        System.out.println(movie.toString());

    }
}
