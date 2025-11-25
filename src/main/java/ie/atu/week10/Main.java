package ie.atu.week10;

public class Main {
    public static void main(String[] args) {
        /*Person firstPerson = new Person("Ethan","San Francisco","1234567890");
        System.out.println(firstPerson.toString());
        Customer customer = new Customer("Ethan","Ireland","0987654321", 12,true);
        System.out.println(customer.toString());
        Customer part2Customer = new Customer("Bob Jones","2 Low Street","0867654321",1002,false);
        part2Customer.setName("Bob Jones");
        part2Customer.setAddress("2 Low Street");
        part2Customer.setPhoneNumber("0867654321");
        part2Customer.setCustomerNumber(1002);
        part2Customer.setMailingList(false);*/
        //System.out.println(part2Customer.toString());
        PreferredCustomer part3Customer = new PreferredCustomer();
        part3Customer.setName("LowRands");
        part3Customer.setAddress("Florida");
        part3Customer.setPhoneNumber("0867654321");
        part3Customer.setCustomerNumber(1003);
        part3Customer.setMailingList(false);
        part3Customer.setLoyaltyPoints(5);
        //part3Customer.addLoyaltyPoints(1);
        //part3Customer.setDiscountLevel(1);
        System.out.println(part3Customer.toString());
    }
}
