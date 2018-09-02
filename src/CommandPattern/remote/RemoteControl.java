package CommandPattern.remote;

import CommandPattern.command.Command;
import CommandPattern.command.NoCommand;

/**
 * @author lkmc2
 * @date 2018/9/2
 * @description 带插槽的遥控器（命令模式）
 */
public class RemoteControl {
    private Command[] onCommands; // 打开命令数组
    private Command[] offCommands; // 关闭命令数组

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand(); // 无操作命令

        // 将所有命令设置为无操作
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    /**
     * 设置指定插槽对应的打开和关闭命令
     * @param slot 插槽号
     * @param onCommand 打开命令
     * @param offCommand 关闭命令
     */
    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    /**
     * 按下指定插槽的打开命令
     * @param slot 插槽号
     */
    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    /**
     * 按下执行插槽的关闭命令
     * @param slot 插槽号
     */
    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("----- 遥控器 -----\n");
        for (int i = 0; i < onCommands.length; i++) {
            result.append(String.format("插槽[%s] %s %s\n",i,
                    onCommands[i].getClass().getSimpleName(),
                    offCommands[i].getClass().getSimpleName()));
        }
        return result.toString();
    }

}
