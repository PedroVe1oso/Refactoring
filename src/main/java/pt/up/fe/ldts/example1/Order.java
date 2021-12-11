package pt.up.fe.ldts.example1;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<OrderLine> lines;

    public Order() {
        lines = new ArrayList<>();
    }

    public void add(Product product, int quantity) {
        lines.add(new OrderLine(product, quantity));
    }

    public boolean isElegibleForFreeDelivery() {
        double total = 0;

        total = getTotal(total);

        if (total > 100) return true;
        else return false;
    }

    public String printOrder() {
        StringBuffer printBuffer = new StringBuffer();

        for (OrderLine line : lines)
            printBuffer.append(line.product.getName() + "(x" + line.quantity + "): " + (line.product.getPrice() * line.quantity) + "\n");

        double total = 0;

        total = getTotal(total);

        printBuffer.append("Total: " + total);

        return printBuffer.toString();S
    }

    private double getTotal(double total) {
        for (OrderLine line : lines)
            total += line.product.getPrice() * line.quantity;
        return total;
    }

}