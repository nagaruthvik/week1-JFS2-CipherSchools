package Cipherschool;


class Amazon{
    float Transaction(float amt){
        Gpay gpayobj = new Gpay();
        float totalAmount = amt+(amt*gpayobj.txnCharge);
        return totalAmount;
    }
}
class Gpay{
    float txnCharge=0.5f;
}
public class Encapsulation {
    public static void main(String[] args){
        Amazon customer = new Amazon();

        System.out.println(customer.Transaction(1000));
    }

}
