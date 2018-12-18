import hsa.*;

public class Taxversion2 {
    
    public static void main(String[] args) {
        Console c = new Console();
        double price, tax, total;
        c.print("Enter price of item: $");
        price = c.readDouble();
        tax = price * 0.13;
        total = price + tax;
        c.println("HST is $" + tax);
        c.println("Total is $" + total);
    }
    
}
