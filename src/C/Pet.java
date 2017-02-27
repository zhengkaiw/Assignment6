/**
 * Created by zhengkevin on 2/26/17.
 */
public class Pet implements Boardable{

    private String petName;
    private String ownerName;
    private String color;
    private int age;
    protected int sex;

    protected enum Sex {
        MALE("Male", 1),
        FEMALE("Female", 2),
        SPAYED("Spayed", 3),
        NEUTERED("Neutered", 4);

        private int sexid;
        private String sexName;

        private Sex(String sexName, int sexid) {
            this.sexName = sexName;
            this.sexid = sexid;
        }

        public static String getName(int i) {
            for (Sex s : Sex.values()) {
                if (s.getSexid() == i) {
                    return s.getSexName();
                }
            }
            return null;
        }

        public int getSexid() {
            return sexid;
        }

        public String getSexName() {
            return sexName;
        }
    }

    Pet(String petName, String ownerName, String color) {

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

    public void setSex(int sexid) {
        sex = sexid;
    }

    public String getSex() {
        return Sex.getName(sex);
    }

    public String toString() {
        return petName + " owned by " + ownerName + System.getProperty("line.separator") + "Color: " + getColor() + System.getProperty("line.separator")
                + "Sex: " + getSex();
    }

    public void setBoardStart(int month, int day, int year){};
    public void setBoardEnd(int month, int day, int year){};
    public boolean boarding(int month, int day, int year){return true;};
}
