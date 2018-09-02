package CommandPattern;

import CommandPattern.command.garage.GarageDoorCloseCommand;
import CommandPattern.command.garage.GarageDoorOpenCommand;
import CommandPattern.command.light.LightOffCommand;
import CommandPattern.command.light.LightOnCommand;
import CommandPattern.command.NoCommand;
import CommandPattern.command.stereo.StereoOffWithCDCommand;
import CommandPattern.command.stereo.StereoOnWithCDCommand;
import CommandPattern.component.GarageDoor;
import CommandPattern.component.Light;
import CommandPattern.component.Stereo;
import CommandPattern.remote.RemoteControl;

/**
 * @author lkmc2
 * @date 2018/9/2
 * @description 遥控器命令模式测试
 */
public class RemoteControlTest {

    public static void main(String[] args) {
        // 灯泡
        Light light = new Light();
        // 开灯命令
        LightOnCommand lightOn = new LightOnCommand(light);
        // 关灯命令
        LightOffCommand lightOff= new LightOffCommand(light);

        // 车库门
        GarageDoor garageDoor = new GarageDoor();
        // 打开车库门命令
        GarageDoorOpenCommand doorOpen = new GarageDoorOpenCommand(garageDoor);
        // 关闭车库门命令
        GarageDoorCloseCommand doorClose = new GarageDoorCloseCommand(garageDoor);

        // 音响
        Stereo stereo = new Stereo();
        // 使用CD打开音响命令
        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        // 使用CD关闭音响命令
        StereoOffWithCDCommand stereoOffWithCD = new StereoOffWithCDCommand(stereo);

        // 遥控器
        RemoteControl remote = new RemoteControl();
        // 设置指定插槽对应的开关命令
        remote.setCommand(0, lightOn, lightOff);
        remote.setCommand(1, doorOpen, doorClose);
        remote.setCommand(2, stereoOnWithCD, stereoOffWithCD);

        System.out.println(remote);

        /*
            运行结果：
            插槽[0] LightOnCommand LightOffCommand
            插槽[1] GarageDoorOpenCommand GarageDoorCloseCommand
            插槽[2] StereoOnWithCDCommand StereoOffWithCDCommand
            插槽[3] NoCommand NoCommand
            插槽[4] NoCommand NoCommand
            插槽[5] NoCommand NoCommand
            插槽[6] NoCommand NoCommand
         */
    }

}
