package CommandPattern.command.fan;

import CommandPattern.command.Command;
import CommandPattern.component.CeilingFan;

/**
 * @author lkmc2
 * @date 2018/9/2
 * @description 关吊扇命令
 */
public class CeilingFanOffCommand implements Command {
    private CeilingFan ceilingFan; // 吊扇
    private int prevSpeed; // 上一次的速度，用以进行撤销

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed(); // 记录风扇的速度
        ceilingFan.off(); // 关吊扇
    }

    @Override
    public void undo() {
        // 根据记录的上一次操作执行撤销
        if (prevSpeed == CeilingFan.HIGH) {
            ceilingFan.high(); // 开启高速档
        } else if (prevSpeed == CeilingFan.MEDIUM) {
            ceilingFan.medium(); // 开启中速档
        } else if (prevSpeed == CeilingFan.LOW) {
            ceilingFan.low();  // 开启低速档
        } else if(prevSpeed == CeilingFan.OFF) {
            ceilingFan.off(); // 关闭风扇
        }
    }
}
