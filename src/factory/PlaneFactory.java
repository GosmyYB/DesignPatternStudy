package factory;

/**
 * Created by wyb.
 */
public class PlaneFactory extends VehicleFactory {

    public Plane create() {
        return new Plane();
    }
}
