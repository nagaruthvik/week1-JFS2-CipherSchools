package Cipherschool;

public class Loops {
   public static void main(String []args){
       //While loop
       char ch='A';
       while (ch<=90){
           System.out.print(ch+" ");;
           ch++;
       }
       System.out.println("\n");
       //do-While loop
       char ch1='A';
       do{
           System.out.print(ch1+" ");
           ch1++;
       }while (ch1<='Z');
   }
}
