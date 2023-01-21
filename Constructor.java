package Cipherschool;

public class Constructor {
    int employeeid;
    int salary;
    String employeeName;
    Constructor(int id,int sal,String name){
        employeeid=id;
        salary=sal;
        employeeName=name;
    }
    public static void main(String[] args){
        Constructor ruthvik = new Constructor(1,1000000,"ruthvik");
        Constructor nani = new Constructor(2,6000000,"nani");
        System.out.println(ruthvik.employeeid+" "+ruthvik.employeeName+" "+ ruthvik.salary);
        System.out.println(nani.employeeid+" "+nani.employeeName+" "+ nani.salary);;

    }
}
