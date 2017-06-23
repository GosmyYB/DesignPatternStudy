package factory;

/**
 * Created by wyb.
 */
public class BroomFactory extends VehicleFactory {
    @Override
    Broom create() {
        return new Broom();
    }
}
