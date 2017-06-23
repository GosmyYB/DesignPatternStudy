package abstractfactory;

/**
 * Created by wyb.
 */
public class DefaultFactory extends AbstractFactory {

    @Override
    public Car createVehicle() {
        return new Car();
    }

    @Override
    public Weapon createWeapon() {
        return new AK47();
    }

    @Override
    public Food createFood() {
        return new Apple();
    }
}
