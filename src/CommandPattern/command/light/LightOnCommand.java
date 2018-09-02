package CommandPattern.command.light;

import CommandPattern.command.Command;
import CommandPattern.component.Light;

/**
 * @author lkmc2
 * @date 2018/9/2
 * @description 开灯命令
 */
public class LightOnCommand implements Command {
    private Light light; // 灯泡

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on(); // 开灯
    }

    @Override
    public void undo() {
        light.off(); // 关灯
    }
}
