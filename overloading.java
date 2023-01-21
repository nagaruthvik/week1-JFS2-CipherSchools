package Cipherschool;

public class overloading {
    void add(int num1,int num2){
        System.out.println(num1+num2);
    }
    void add(int num1,int num2,int num3){
        System.out.println(num1+num2+num3);
    }
    void add(float num1,float num2){
        System.out.println(num1+num2);
    }
    void add(float num1,float num2,float num3){
        System.out.println(num1+num2+num3);
    }
    public static void main(String[] args){
        overloading ov = new overloading();
        ov.add(1,2);
        ov.add(2.2f,3.3f);
        ov.add(1,2,3);
        ov.add(2.2f,4.4f,3.3f);
    }
}
