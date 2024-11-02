package Strategy;

public class Example {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Adding items to the cart
        cart.addItem("Laptop", 1200);
        cart.addItem("Headphones", 150);

        // Selecting payment method (Credit Card in this case)
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9876-5432", "John Doe", "123", "12/26");
        cart.setPaymentStrategy(creditCardPayment);
        cart.checkout();
        
        System.out.println("\n--- New Checkout Session ---\n");

        // Another checkout with PayPal payment
        cart.addItem("Mouse", 50);
        cart.addItem("Keyboard", 100);
        PaymentStrategy paypalPayment = new PayPalPayment("user@example.com", "securePassword");
        cart.setPaymentStrategy(paypalPayment);
        cart.checkout();

        System.out.println("\n--- New Checkout Session ---\n");

        // Another checkout with Crypto payment
        cart.addItem("Desk", 200);
        cart.addItem("Chair", 250);
        PaymentStrategy cryptoPayment = new CryptoPayment("1PSSGeFHDnKNxiEyFrD1wcEaHr9hrQDDWc");
        cart.setPaymentStrategy(cryptoPayment);
        cart.checkout();
    }
}

