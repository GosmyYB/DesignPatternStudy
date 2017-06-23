package command;

/**
 * Created by wyb.
 */
public abstract class Command {
    public abstract void execute();
    // 最原始的 四人帮 设计这个模式是为了实现 unDo 功能
    public abstract void unDo();
}
