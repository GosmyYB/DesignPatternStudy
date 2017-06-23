package factory;

/**
 * Created by wyb.
 */
public class Plane implements Movable {
    @Override
    public void run() {
        System.out.println("扇着翅膀前进中 plane...");
    }
}
