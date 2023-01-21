package Cipherschool;
interface olaCustomer{
    void bookCab();
    void findARide();
    void rentCab();
    void rateDriver();
    void scheduleCab();
    void cancleCab();
    void addMoneytoWallet();
    void raiseTicket();
    void signup();
    void signIn();
}
interface olaDriver{
    void acceptBooking();
    void getCustomerLocation();
    void setAvailableStatus();
    void getMyCommission();
    void raiseMoneyTransferRequest();
    void callCustomer();
    void setUpyourVehicle();
    void customerFeedback();
}
interface olaOwner{
    void getDriverRecord();
    void getReportByDriverID();
    void getReportByregion();
    void getTotalRevenue();
    void getCustomersFeedack();
    void addDriver();
    void removeDriver();
    void changeDriverStatus();
}

    
public class Abstraction implements olaCustomer,olaDriver,olaOwner{

    public static void main(String[] args){
        olaCustomer ruthvik = new Abstraction();
        ruthvik.bookCab();
        ruthvik.addMoneytoWallet();
    }

    @Override
    public void bookCab() {

    }

    @Override
    public void findARide() {

    }

    @Override
    public void rentCab() {

    }

    @Override
    public void rateDriver() {

    }

    @Override
    public void scheduleCab() {

    }

    @Override
    public void cancleCab() {

    }

    @Override
    public void addMoneytoWallet() {

    }

    @Override
    public void raiseTicket() {

    }

    @Override
    public void signup() {

    }

    @Override
    public void signIn() {

    }

    @Override
    public void acceptBooking() {

    }

    @Override
    public void getCustomerLocation() {

    }

    @Override
    public void setAvailableStatus() {

    }

    @Override
    public void getMyCommission() {

    }

    @Override
    public void raiseMoneyTransferRequest() {

    }

    @Override
    public void callCustomer() {

    }

    @Override
    public void setUpyourVehicle() {

    }

    @Override
    public void customerFeedback() {

    }

    @Override
    public void getDriverRecord() {

    }

    @Override
    public void getReportByDriverID() {

    }

    @Override
    public void getReportByregion() {

    }

    @Override
    public void getTotalRevenue() {

    }

    @Override
    public void getCustomersFeedack() {

    }

    @Override
    public void addDriver() {

    }

    @Override
    public void removeDriver() {

    }

    @Override
    public void changeDriverStatus() {

    }
}

