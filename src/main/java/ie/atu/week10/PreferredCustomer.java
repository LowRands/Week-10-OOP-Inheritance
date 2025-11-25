package ie.atu.week10;

public class PreferredCustomer extends Customer {
    private int loyaltyPoints;
    private double discountLevel; //0.05 for 5%
    public PreferredCustomer() {
        super();
        loyaltyPoints = 0;
        discountLevel = 0;
    }

    public PreferredCustomer(String name, String address, String phoneNumber, int customerNumber, boolean mailingList, int loyaltyPoints, double discountLevel) {
        super(name, address, phoneNumber, customerNumber, mailingList);
        this.loyaltyPoints = loyaltyPoints;
        this.discountLevel = discountLevel;
    }
    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public void setLoyaltyPoints(int loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
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
                "\nDiscountLevel = " + discountLevel;
    }
}
