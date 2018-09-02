package CommandPattern.command;

/**
 * @author lkmc2
 * @date 2018/9/2
 * @description 宏命令（可以一次执行多个命令）
 */
public class MacroCommand implements Command {
    private Command[] commands; // 命令数组

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }


    @Override
    public void execute() {
        // 执行命令数组的所有操作
        for (Command command : commands) {
            command.execute();
        }
    }

    @Override
    public void undo() {

    }
}
