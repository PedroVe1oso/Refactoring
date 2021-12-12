package pt.up.fe.ldts.example3;

public class Discount {
    private final int fixed;
    private final double percentage;

    public Discount(int fixed) {
        this.fixed = fixed;
        this.percentage = 0;
    }

    public Discount(double percentage) {
        this.percentage = percentage;
        this.fixed = 0;
    }

    public int getFixed() {
        return fixed;
    }

    public double getPercentage() {
        return percentage;
    }
}
