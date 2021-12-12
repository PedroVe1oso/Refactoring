package pt.up.fe.ldts.example3;

public class SimpleOrder {
    private Discount discount;
    private double price;

    public SimpleOrder(double price) {
        this.price = price;
    }

    private double applyDiscount() {
        if (discount.getFixed() > 0) price = discount.getFixed() > price ? 0 : price - discount.getFixed();
        else if (discount.getPercentage() > 0) price = price - price * discount.getPercentage();

        return price;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public double getTotal() {
        if (discount == null)
            return price;
        else
            return applyDiscount();
    }
}
