package lab1.codeFromUml;

public class Main {
    public static void main(String[] args) {

        // object for corporate customer
        CorporateCustomer corporateCustomer = new CorporateCustomer();
        System.out.println("-------- Details for Corporate Customer --------");
        corporateCustomer.setName("Corporate Customer");
        corporateCustomer.setAddress("symbiosis institute of technology");
        corporateCustomer.setCreditRating(4.5);
        corporateCustomer.setCreditLimit(20000);

        // printing details
        System.out.println(corporateCustomer.getName());
        System.out.println(corporateCustomer.getAddress());
        System.out.println(corporateCustomer.getCreditRating());
        if (corporateCustomer.remind() == -1) {
            System.out.println("Limit reached");
        } else {
            System.out.println("Your Limit is good");
        }

        // object for personal customer
        PersonalCustomer personalCustomer = new PersonalCustomer();
        System.out.println("-------- Details for Personal Customer --------");
        personalCustomer.setName("personal customer");
        personalCustomer.setAddress("Symbiosis International University");
        personalCustomer.setCreditRating(4.0);
        personalCustomer.setCreditCardID(1111222233334444L);

        // printing details
        System.out.println(personalCustomer.getName());
        System.out.println(personalCustomer.getAddress());
        System.out.println(personalCustomer.getCreditRating());
        System.out.println(personalCustomer.getCreditCardID());
    }
}
