package command;

import bridge.Flower;
import bridge.Gift;
import bridge.WarmGift;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wyb.
 */
public class Boy {
    private String name;
    private List<Command> commands = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void pursue(MM mm) {
        Gift g = new WarmGift(new Flower());
        give(g, mm);
    }

    public void give(Gift g, MM mm) {

    }

    public void addCommand(Command c) {
        commands.add(c);
    }

    public void doSomething() {
        for (Command c : commands) {
            c.execute();
        }
    }

    public void undoCommands() {

    }
}
