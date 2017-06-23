package state;

/**
 * Created by wyb.
 */
public class MMHappyState extends MMState {

    @Override
    public void smile() {
        System.out.println("MM is smiling happily");
    }

    @Override
    public void cry() {
        System.out.println("MM is crying happily");
    }

    @Override
    public void say() {
        System.out.println("MM is saying happily");
    }
}
