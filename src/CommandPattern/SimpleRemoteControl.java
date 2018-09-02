package CommandPattern;

/**
 * @author lkmc2
 * @date 2018/9/2
 * @description 遥控器（命令模式）
 */
public class SimpleRemoteControl {
    private Command slot; // 命令插槽

    public SimpleRemoteControl() {
    }

    // 设置命令
    public void setCommand(Command command) {
        this.slot = command;
    }

    // 按下执行按钮
    public void buttonWasPressed() {
        slot.execute(); // 执行命令
    }

}
