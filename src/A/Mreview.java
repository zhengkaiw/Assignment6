import java.util.*;

/**
 * Created by zhengkevin on 2/26/17.
 */

public class Mreview implements Comparable<Mreview> {

    private String title;
    private ArrayList<Integer> ratings;

    Mreview() {

        title = "";
        ratings = new ArrayList<Integer>();

    }

    Mreview(String ttl) {

        title = ttl;
        ratings = new ArrayList<Integer>();

    }

    Mreview(String ttl, int firstRating) {

        title = ttl;
        ratings = new ArrayList<Integer>();
        ratings.add(firstRating);

    }

    public void addRating(int r) {

        ratings.add(r);

    }

    public double aveRating() {

        double t = 0;

        for (int i : ratings) {
            t += i;
        }

        t /= ratings.size();

        return t;

    }

    public int compareTo(Mreview obj) {

        if (title.length() < obj.title.length()) {
            return obj.title.length() - title.length();
        } else if (title.length() > obj.title.length()) {
            return title.length() - obj.title.length();
        } else {
            for (int i = 0; i < title.length(); i++) {
                if (title.charAt(i) > obj.title.charAt(i)) {
                    return title.charAt(i) - obj.title.charAt(i);
                } else if (title.charAt(i) < obj.title.charAt(i)) {
                    return obj.title.charAt(i) - title.charAt(i);
                }
            }
            return 0;
        }

    }

    public boolean equals(Object obj) {

        Mreview m = (Mreview) obj;

        if (title == m.title) {
            return true;
        } else {
            return false;
        }

    }

    public String getTitle() {
        return title;
    }

    public int numRatings() {
        return ratings.size();
    }

    public String toString() {

        String s = "";

        s += "title:   " + title + System.getProperty("line.separator") + "ratings: ";
        for (int i : ratings) {
            s += i + " ";
        }

        return s;
    }
}
