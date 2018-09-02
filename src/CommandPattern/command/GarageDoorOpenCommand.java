package CommandPattern.command;

import CommandPattern.component.GarageDoor;

/**
 * @author lkmc2
 * @date 2018/9/2
 * @description 打开车库门命令
 */
public class GarageDoorOpenCommand implements Command {
    private GarageDoor garageDoor; // 车库门

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up(); // 车库门升起
    }
}
