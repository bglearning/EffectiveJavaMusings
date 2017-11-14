package ejm.chapter08.item48;

import java.math.BigDecimal;

public class App {

    public static void main(String[] args) {
        double funds = 1.00;
        int itemsBought = 0;
        for (double price = 0.1; funds >= price; price += 0.1) {
            funds -= price;
            itemsBought++;
        }

        System.out.println("Using \"double\":");
        System.out.println(String.format("Items Bought: %s, Funds: %s", itemsBought, funds));

        final BigDecimal TEN_CENTS = new BigDecimal(".10");

        BigDecimal bFunds = new BigDecimal("1.00");
        itemsBought = 0;

        for (BigDecimal price = TEN_CENTS; bFunds.compareTo(price) >= 0; price = price.add(TEN_CENTS)) {
            bFunds = bFunds.subtract(price);
            itemsBought++;
        }

        System.out.println("Using \"BigDecimal\":");
        System.out.println(String.format("Items Bought: %s, Funds: %s", itemsBought, bFunds));
    }
}
