package lab1.codeFromUml;

public class CorporateCustomer extends Customer {

    private int creditLimit;

    public int remind() {
        if (creditLimit > 20000) {
            return -1;
        } else {
            return creditLimit;
        }
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
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
    public double getCreditRating() {
        return super.getCreditRating();
    }

    @Override
    public void setCreditRating(double creditRating) {
        super.setCreditRating(creditRating);
    }
}
