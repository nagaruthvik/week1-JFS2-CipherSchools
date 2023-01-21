package Cipherschool;
abstract class Doctor{
    abstract void treatpatient();
}
class Physician extends Doctor{
    @Override
    void treatpatient() {
        System.out.println("Hi! I am Physiacn \nI Treat Patients using Medicines");
    }
}
class Surgeon extends Doctor{
    @Override
    void treatpatient() {
        System.out.println("Hi! I am Surgeon \nI Treat Patients using Surgery!");
    }
}
class Dentist extends Doctor{
    @Override
    void treatpatient() {
        System.out.println("Hi! I am Dentist \nI Treat Patients Teeth");
    }
}
public class overriding {
    public static void main(String[] args){
        System.out.println("HI! I am Alex! Receptionis at Max Care" +
                "\nWho you are looking for ?" +
                "\nPress \n1. Physician\n2. Surgeon\n3. Dentist");
        int choice = new java.util.Scanner(System.in).nextInt();
        Doctor doc=null ;
        switch (choice){
            case 1:
                doc = new Physician();
                break;
            case 2:
                doc = new Surgeon();
                break;
            case 3:
                doc = new Dentist();
                break;
            default:
                System.out.println("A oh! Invalid choice");
        }
        if (choice<0 || choice>3){
            System.exit(0);
        }
        else {
            doc.treatpatient();
        }
    }
}
