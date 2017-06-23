package proxy;

import java.util.Random;

/**
 * Created by wyb.
 */
public class Tank implements Movable {

    @Override
    public void move() {
        System.out.println("Tank Moving...");
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void stop() {
        System.out.println("Tank Stopping...");
    }
}
