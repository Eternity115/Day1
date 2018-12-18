import hsa.*;
public class PayCalc {
    
    public static void main(String[] args) {
        Console c = new Console();
        double wage, pay, hours;
        
        //ask for hours
        c.print("Enter hours worked this week: ");
        hours=c.readDouble();
        //ask for wage
        c.print("How much do you make per hour? $");
        wage = c.readDouble();
        //calc pay and show answer
        pay = wage * hours;
        c.println("Your pay is: $" + pay);
    }
    
}
