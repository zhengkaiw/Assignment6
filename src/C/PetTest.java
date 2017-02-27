/**
 * Created by zhengkevin on 2/26/17.
 */
public class PetTest {

    public static void main(String[] args) {

        Pet p1 = new Cat("Tom", "Jerry", "blue and white", "long");
        Pet p2 = new Dog("Pluto", "MickeyMouse","yellow","large");

        p1.setSex(2);
        p2.setSex(1);
        System.out.println(p1.toString());
        System.out.println(p2.toString());

        p1.setBoardStart(8,25,2016);
        p1.setBoardEnd(8,30,2016);
        System.out.println(p1.boarding(8,26,2016));
        System.out.println(p1.boarding(8,31,2016));
    }
}
