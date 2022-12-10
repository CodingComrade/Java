public class PreferredCustomer extends Customer{
    private int totalPurchases;
    private int discountLevel;

    public int getTotalPurchases() {
        return totalPurchases;
    }

    public int getDiscountLevel() {
        return discountLevel;
    }

    public void setTotalPurchases(int totalPurchases) {
        this.totalPurchases = totalPurchases;
    }

    public void setDiscountLevel(int discountLevel) {
        this.discountLevel = discountLevel;
    }
}
