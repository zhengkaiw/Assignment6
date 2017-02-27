/**
 * Created by zhengkevin on 2/26/17.
 */
public class Dog extends Pet implements Boardable{

    private String size;
    protected int smonth;
    protected int emonth;
    protected int sday;
    protected int eday;
    protected int syear;
    protected int eyear;

    public String getSize(){
        return size;
    }

    Dog(String petName, String ownerName, String color, String size){

        super(petName, ownerName, color);
        this.size = size;

    }

    public String toString(){
        return "DOG:"+System.getProperty("line.separator")+getPetName()+" owned by "+getOwnerName()+System.getProperty("line.separator")
                +"Color: "+getColor()+System.getProperty("line.separator")+"Sex: "+getSex()+System.getProperty("line.separator")
                +"Size: "+ getSize();
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
