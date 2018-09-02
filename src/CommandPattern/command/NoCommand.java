package CommandPattern.command;

/**
 * @author lkmc2
 * @date 2018/9/2
 * @description 无操作命令
 */
public class NoCommand implements Command {
    @Override
    public void execute() {
        // 无操作
    }

    @Override
    public void undo() {
        // 无操作
    }
}
