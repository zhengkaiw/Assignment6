/**
 * Created by zhengkevin on 2/26/17.
 */

public class MreviewTest {

    public static void main(String[] args) {

        Mreview m = new Mreview("Bat man", 9);
        Mreview m2 = new Mreview("Bat men", 8);

        m.addRating(10);

        m.addRating(9);

        System.out.println(m.toString());
        System.out.println(String.format("$%.2f", m.aveRating()));
        System.out.println(m.compareTo(m2));
        System.out.println(m.equals(m2));
    }

}
