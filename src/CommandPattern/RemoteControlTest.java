package CommandPattern;

import CommandPattern.command.GarageDoorOpenCommand;
import CommandPattern.command.LightOnCommand;
import CommandPattern.component.GarageDoor;
import CommandPattern.component.Light;
import CommandPattern.remote.SimpleRemoteControl;

/**
 * @author lkmc2
 * @date 2018/9/2
 * @description 命令模式测试
 */
public class RemoteControlTest {

    public static void main(String[] args) {
        // 灯泡
        Light light = new Light();
        // 开灯命令
        LightOnCommand lightOn = new LightOnCommand(light);

        // 车库门
        GarageDoor garageDoor = new GarageDoor();
        // 打开车库门命令
        GarageDoorOpenCommand doorOpen = new GarageDoorOpenCommand(garageDoor);

        // 遥控器
        SimpleRemoteControl remote = new SimpleRemoteControl();
        // 设置命令为开灯
        remote.setCommand(lightOn);
        // 按下执行按钮
        remote.buttonWasPressed();

        // 设置命令为打开车库门
        remote.setCommand(doorOpen);
        // 按下执行按钮
        remote.buttonWasPressed();
        /*
            运行结果：
            已开灯
            车库门升起
         */
    }

}
