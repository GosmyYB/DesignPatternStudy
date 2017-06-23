package state;

/**
 * Created by wyb.
 */
public class MMSadState extends MMState {
    @Override
    public void smile() {
        System.out.println("MM is smiling sadly");
    }

    @Override
    public void cry() {
        System.out.println("MM is crying sadly");
    }

    @Override
    public void say() {
        System.out.println("MM is saying sadly");
    }
}
