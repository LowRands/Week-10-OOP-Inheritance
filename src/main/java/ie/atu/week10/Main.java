package ie.atu.week10;

public class Main {
    public static void main(String[] args) {
        Person firstPerson = new Person("Ethan","San Francisco","1234567890");
        System.out.println(firstPerson.toString());
        Customer customer = new Customer("Ethan","Ireland","0987654321", 12,true);
        System.out.println(customer.toString());
    }
}
