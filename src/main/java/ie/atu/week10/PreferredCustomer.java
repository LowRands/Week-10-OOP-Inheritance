package ie.atu.Week10;

public class PreferredCustomer extends Customer {
    private int loyaltyPoints;
    private double discountLevel; //0.05 for 5%
    public PreferredCustomer() {
        super(); // Calls Customer's default constructor
        loyaltyPoints = 0; // No points initially
        discountLevel = 0; // No discount initially
    }
    public void addLoyaltyPoints(int Points) {
        this.loyaltyPoints += Points;
        updateDiscountLevel(); // Adjust discount based on new total
    }
    public PreferredCustomer(String name, String address, String phoneNumber, int customerNumber, boolean mailingList, int loyaltyPoints, double discountLevel) {
        super(name, address, phoneNumber, customerNumber, mailingList);
        this.loyaltyPoints = loyaltyPoints;
        this.discountLevel = discountLevel;
    }
    // Updates discountLevel based on the number of loyalty points
    private void updateDiscountLevel() {// set discountLevel based on loyaltyPoints
        if (loyaltyPoints < 500) discountLevel = 0;
        if (loyaltyPoints >= 500 && loyaltyPoints <= 999) discountLevel = 0.05;
        if (loyaltyPoints >= 1000 && loyaltyPoints <= 1499) discountLevel = 0.06;
        if (loyaltyPoints >= 1500 && loyaltyPoints <= 1999) discountLevel = 0.07;
        if (loyaltyPoints >= 2000) discountLevel = 0.1;
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public void setLoyaltyPoints(int loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
        updateDiscountLevel();
    }

    public double getDiscountLevel() {
        return discountLevel;
    }

    public void setDiscountLevel(double discountLevel) {
        this.discountLevel = discountLevel;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPreferredCustomer: " +
                "\nLoyaltyPoints = " + loyaltyPoints +
                "\nDiscountLevel = " + discountLevel*100 + "%";
    }
}
