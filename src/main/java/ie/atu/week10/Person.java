package ie.atu.week10;

public class Person {
    private String Name;
    private String address;
    private String phoneNumber;

    public Person() {
        this.Name = "";
        this.address = "";
        this.phoneNumber = "";
    }
    public Person(String name, String address, String phoneNumber) {
        this.Name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "\nName = '" + Name + '\'' +
                "\nAddress = '" + address + '\'' +
                "\nPhoneNumber = '" + phoneNumber + '\'';
    }
}
