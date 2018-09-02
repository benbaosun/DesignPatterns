package CommandPattern.command.light;

import CommandPattern.command.Command;
import CommandPattern.component.Light;

/**
 * @author lkmc2
 * @date 2018/9/2
 * @description 关灯命令
 */
public class LightOffCommand implements Command {
    private Light light; // 灯泡

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off(); // 关灯
    }
}
