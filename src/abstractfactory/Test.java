package abstractfactory;

/**
 * Created by wyb.
 */
public class Test {

    public static void main(String[] args) {
        // 系列产品
        AbstractFactory f = new MagicFactory();
        Vehicle c = f.createVehicle();
        c.run();
        Weapon ak = f.createWeapon();
        ak.shoot();
        Food a = f.createFood();
        a.printName();
    }
}
