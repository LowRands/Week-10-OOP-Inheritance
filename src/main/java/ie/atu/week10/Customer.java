package ie.atu.Week10;

public class Customer extends Person // Customer class extends Person and adds customer-specific fields
{
 private int customerNumber;
 private boolean mailingList;

    public Customer() {
        super(); // Calls the default constructor of Person
        this.customerNumber = 0; // assigns default value to customer number as 0
        this.mailingList = false; // assigns default value to mailing list as false
    }
    // Parameterized constructor
    public Customer(String name, String address, String phoneNumber, int customerNumber, boolean mailingList) { // Passes values to Person constructor
        super(name, address, phoneNumber);
        this.customerNumber = customerNumber; // Sets customer number
        this.mailingList = mailingList; // Sets mailing list status
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public boolean isMailingList() {
        return mailingList;
    }

    public void setMailingList(boolean mailingList) {
        this.mailingList = mailingList;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCustomerNumber = " + customerNumber +
                "\nMailingList = " + mailingList;
    }
}
