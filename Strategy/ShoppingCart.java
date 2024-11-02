package Strategy;

import java.util.ArrayList;

class ShoppingCart {
    private ArrayList<String> items;
    private double totalAmount;
    private PaymentStrategy paymentStrategy;

    public ShoppingCart() {
        items = new ArrayList<>();
        totalAmount = 0;
    }

    public void addItem(String item, double price) {
        items.add(item);
        totalAmount += price;
        System.out.println(item + " added to cart. Price: $" + price);
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout() {
        if (paymentStrategy == null) {
            System.out.println("Please select a payment method.");
        } else {
            paymentStrategy.pay(totalAmount);
            System.out.println("Checkout completed.");
        }
    }
}

