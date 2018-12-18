
public class Car {
    
    int fuel = 50;
    
    void honk(){
        System.out.println("Beep Beep");
    }
    void brake(){
        System.out.println("Car is now stopped");
    }
    void go(){
        System.out.println("Car is now driving");
        fuel -=10;
    } 
    void fill(){
        fuel=50;
    }
}
