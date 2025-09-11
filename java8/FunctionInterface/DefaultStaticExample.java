package FunctionInterface;

public class DefaultStaticExample {
    public static void main(String[] args) {


        StaticMethod.Car c = new StaticMethod.Car();
        c.start();
        c.fuelType();
        StaticMethod.vehicle.serviceInfo();
    }
}