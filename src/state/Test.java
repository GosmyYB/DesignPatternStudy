package state;

/**
 * Created by wyb.
 */
public class Test {
    public static void main(String[] args) {
        MM mm = new MM("MJJ", new MMSadState());
        mm.say();
        mm.cry();
        mm.say();
    }
}
