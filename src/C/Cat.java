/**
 * Created by zhengkevin on 2/26/17.
 */
public class Cat extends Pet implements Boardable{

    private String hairLength;
    protected int smonth;
    protected int emonth;
    protected int sday;
    protected int eday;
    protected int syear;
    protected int eyear;

    public String getHairLength(){
        return hairLength;
    }

    Cat(String petName, String ownerName, String color, String hairLength){

        super(petName, ownerName, color);
        this.hairLength = hairLength;

    }

    public String toString(){
        return "CAT:"+System.getProperty("line.separator")+getPetName()+" owned by "+getOwnerName()+System.getProperty("line.separator")
                +"Color: "+getColor()+System.getProperty("line.separator")+"Sex: "+getSex()+System.getProperty("line.separator")
                +"Hair: "+ getHairLength();
    }

    public void setBoardStart(int month, int day, int year){
        if(month>=1&&month<=12&&day>=1&&day<=31&&year<=9999&year>=1000) {
            smonth = month;
            sday = day;
            syear = year;
        }else{
            System.out.println("Invalid date");
        }
    }

    public void setBoardEnd(int month, int day, int year){
        if(month>=1&&month<=12&&day>=1&&day<=31&&year<=9999&year>=1000) {
            emonth = month;
            eday = day;
            eyear = year;
        }else{
            System.out.println("Invalid date");
        }
    }

    public boolean boarding(int month, int day, int year){

        if (month >= smonth && month <= emonth&&day >= sday && day <= eday&&year >= syear && year<= eyear){
            return true;
        }else{
            return false;
        }

    }

}
