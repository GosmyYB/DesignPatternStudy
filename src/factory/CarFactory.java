package factory;

/**
 * Created by wyb.
 */
public class CarFactory extends VehicleFactory {

    @Override
    Movable create() {
        return new Car();
    }
}
