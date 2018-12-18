import TerminalIO.*;

public class Taxversion1 {

    public static void main(String[] args) {
        KeyboardReader k = new KeyboardReader();
        double price, tax, total;
        price = k.readDouble("Enter price of item: $");
        tax = price * 0.13;
        total = price + tax;
        System.out.println("HST is $" + tax);
        System.out.println("Total is $" + total);
    }
    
}
