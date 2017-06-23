package proxy;

/**
 * Created by wyb.
 */
public class TankTimeProxy implements Movable {

    private Movable m;

    public TankTimeProxy(Movable m) {
        this.m = m;
    }

    @Override
    public void move() {
        long start = System.currentTimeMillis();
        m.move();
        long end = System.currentTimeMillis();
        System.out.println("time: " + (end - start));
    }

    @Override
    public void stop() {
        long start = System.currentTimeMillis();
        m.stop();
        long end = System.currentTimeMillis();
        System.out.println("time: " + (end - start));
    }
}
