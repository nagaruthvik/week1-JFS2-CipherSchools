package Cipherschool;

class Classroom{
    private String name="ruthvik";
    private int standard=10;
    private int rollno=1;
    private String section="A";
    public void setName(String newCharge) {
        name=newCharge;
    }
    public void setStandard(int stan) {
        standard=stan;
    }
    public void setRollno(int roll) {
        rollno=roll;
    }
    public void setSection(String sec) {
        section=sec;
    }
    public String getName() {
        return name;
    }
    public int getStandard() {
        return standard;
    }
    public int getRollno() {
        return rollno;
    }
    public String setSection() {
        return section;
    }
}


public class Task2 {
    public static void main(String[] args){
        Classroom ruthvik = new Classroom();
        System.out.println(ruthvik.getName()+" "+ruthvik.setSection()+" "+ruthvik.getRollno()+" "+ruthvik.getStandard());
        Classroom nani = new Classroom();
        nani.setStandard(1);
        nani.setSection("B");
        nani.setName("nani");
        nani.setRollno(2);
        System.out.println(nani.getName()+" "+nani.setSection()+" "+nani.getRollno()+" "+nani.getStandard());
    }

}
