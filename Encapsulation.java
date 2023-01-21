package Cipherschool;


class Amazon{
    float Transaction(float amt){
        Gpay gpayobj = new Gpay();
        gpayobj.setTxnCharge(0.07f);
        float totalAmount = amt+(amt*gpayobj.getTxnCharge());
        return totalAmount;
    }
}
class Gpay {
    private float txnCharge = 0.5f;

    public void setTxnCharge(float newCharge) {
        if (newCharge <= 0.05f) {
            System.out.println("Invalid TxtCharge");
            return;
        }
        txnCharge = newCharge;

    }

    public float getTxnCharge() {
        return txnCharge;

    }
}
public class Encapsulation {
    public static void main(String[] args){
        Amazon customer = new Amazon();

        System.out.println(customer.Transaction(1000));
    }

}
