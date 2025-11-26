package ie.atu.Week10;

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
        PreferredCustomer part3Customer = new PreferredCustomer("LowRands","Florida","0867654321",1003,false,0,0);
        /*part3Customer.setName("LowRands");
        part3Customer.setAddress("Florida");
        part3Customer.setPhoneNumber("0867654321");
        part3Customer.setCustomerNumber(1003);
        part3Customer.setMailingList(false);
        part3Customer.setLoyaltyPoints(1000);*/
        //part3Customer.addLoyaltyPoints(1);
        //part3Customer.setDiscountLevel(1);
        Customer customer = new Customer("Alice Smith","1 High Street", "0851234567", 1001, true);
        System.out.println(customer);
        System.out.println(part3Customer);
        PreferredCustomer pc = new PreferredCustomer();
        pc.setName("Charlie Customer");
        pc.setAddress("3 Middle Road");
        pc.setPhoneNumber("0871112222");
        pc.setCustomerNumber(2001);
        pc.setMailingList(true);
        pc.addLoyaltyPoints(700);
        System.out.println(pc);
        pc.addLoyaltyPoints(800);
        System.out.println(pc);
    }
}
