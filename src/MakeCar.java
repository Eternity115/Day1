
public class MakeCar {

    
    public static void main(String[] args) {
        Car x = new Car();
        System.out.println("Car fuel level: " + x.fuel);
        x.honk();
        x.go();
        x.go();
        x.brake();
        System.out.println("Car fuel level: " + x.fuel);
        System.out.println("Filling up");
        x.fill();
        System.out.println("Car fuel level: " + x.fuel);
    }
    
}
