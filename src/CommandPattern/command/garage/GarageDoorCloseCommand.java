package CommandPattern.command.garage;

import CommandPattern.command.Command;
import CommandPattern.component.GarageDoor;

/**
 * @author lkmc2
 * @date 2018/9/2
 * @description 关闭车库门命令
 */
public class GarageDoorCloseCommand implements Command {
    private GarageDoor garageDoor; // 车库门

    public GarageDoorCloseCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down(); // 车库门下降
    }

    @Override
    public void undo() {
        garageDoor.up(); // 车库门升起
    }
}
