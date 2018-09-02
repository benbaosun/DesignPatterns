package CommandPattern.command.fan;

import CommandPattern.command.Command;
import CommandPattern.component.CeilingFan;
import CommandPattern.component.Light;

/**
 * @author lkmc2
 * @date 2018/9/2
 * @description 开吊扇命令
 */
public class CeilingFanOnCommand implements Command {
    private CeilingFan fan; // 吊扇

    public CeilingFanOnCommand(CeilingFan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.on(); // 开吊扇
    }
}
