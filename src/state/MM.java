package state;

/**
 * Created by wyb.
 */
public class MM {
    private String name;

    private MMState state;

    public MM(String name, MMState state) {
        this.name = name;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void smile() {
        state.smile();
    }

    public void cry() {
        state.cry();
    }

    public void say() {
        state.say();
    }
}
