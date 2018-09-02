package CommandPattern.command.fan;

import CommandPattern.command.Command;
import CommandPattern.component.CeilingFan;

/**
 * @author lkmc2
 * @date 2018/9/2
 * @description 关吊扇命令
 */
public class CeilingFanOffCommand implements Command {
    private CeilingFan fan; // 吊扇

    public CeilingFanOffCommand(CeilingFan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.off(); // 关吊扇
    }

    @Override
    public void undo() {
        fan.on(); // 开吊扇
    }
}
