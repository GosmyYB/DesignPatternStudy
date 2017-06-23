package proxy;

/**
 * Created by wyb.
 */
public class Client {
    public static void main(String[] args) {
        Tank t = new Tank();
        Movable m = (Movable) Proxy.newProxyInstance();
        m.move();
    }
}
