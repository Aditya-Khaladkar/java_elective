package lab1.codeFromUml;

public class PersonalCustomer extends Customer {

    private long creditCardID;

    public long getCreditCardID() {
        return creditCardID;
    }

    public void setCreditCardID(long creditCardID) {
        this.creditCardID = creditCardID;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getAddress() {
        return super.getAddress();
    }

    @Override
    public void setAddress(String address) {
        super.setAddress(address);
    }

    @Override
    public double getCreditRating() {
        return super.getCreditRating();
    }

    @Override
    public void setCreditRating(double creditRating) {
        super.setCreditRating(creditRating);
    }
}
