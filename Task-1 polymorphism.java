package Cipherschool;
class Addition{
    void sum(int num1,int num2){
        System.out.println(num1+num2);
    }
    void sum(int num1,int num2,int num3){
        System.out.println(num1+num2+num3);
    }
    void sum(float num1,float num2){
        System.out.println(num1+num2);
    }
}
public class Task1 {
    public static void main(String [] args){
        Addition add = new Addition();
        add.sum(2,2);
        add.sum(2.2f,2.2f);
        add.sum(2,2,2);
    }
}
