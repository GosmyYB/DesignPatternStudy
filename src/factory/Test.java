package factory;

/**
 * Created by wyb.
 */
public class Test {
    public static void main(String[] args) {
//        Car car = Car.getInstance();
//        Car car2 = Car.getInstance();
//        if (car == car2) {
//            System.out.println("Same car");
//        }
        VehicleFactory factory = new BroomFactory();
        Movable m = factory.create();
        m.run();
    }
}
