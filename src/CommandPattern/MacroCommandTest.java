package CommandPattern;

import CommandPattern.command.Command;
import CommandPattern.command.MacroCommand;
import CommandPattern.command.garage.GarageDoorCloseCommand;
import CommandPattern.command.garage.GarageDoorOpenCommand;
import CommandPattern.command.light.LightOffCommand;
import CommandPattern.command.light.LightOnCommand;
import CommandPattern.command.stereo.StereoOffWithCDCommand;
import CommandPattern.command.stereo.StereoOnWithCDCommand;
import CommandPattern.component.GarageDoor;
import CommandPattern.component.Light;
import CommandPattern.component.Stereo;
import CommandPattern.remote.RemoteControlWithUndo;

/**
 * @author lkmc2
 * @date 2018/9/2
 * @description 宏命令测试类
 * 执行一个包含多个命令的命令
 */
public class MacroCommandTest {

    public static void main(String[] args) {
        Light light = new Light("客厅"); // 灯泡
        Stereo stereo = new Stereo("客厅"); // 音响
        GarageDoor garageDoor = new GarageDoor("车库"); // 车库名

        // 为家用电器创建各自的开、关事件
        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);
        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffWithCDCommand stereoOffWithCD = new StereoOffWithCDCommand(stereo);
        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorClose = new GarageDoorCloseCommand(garageDoor);

        // 分别将开启、关闭事件放到不同的数组
        Command[] partyOn = {lightOn, stereoOnWithCD, garageDoorOpen};
        Command[] partyOff = {lightOff, stereoOffWithCD, garageDoorClose};

        // 分别使用开启、关闭事件数组创建宏命令
        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        // 遥控器
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
        // 设置宏命令到遥控器中
        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);
        // 打印遥控器的设置
        System.out.println(remoteControl);

        /*
            运行结果：
            ----- 遥控器 -----
            插槽[0] MacroCommand MacroCommand
            插槽[1] NoCommand NoCommand
            插槽[2] NoCommand NoCommand
            插槽[3] NoCommand NoCommand
            插槽[4] NoCommand NoCommand
            插槽[5] NoCommand NoCommand
            插槽[6] NoCommand NoCommand
         */

        System.out.println("------ 按下宏命令开启按钮 ------");
        remoteControl.onButtonWasPushed(0);

        System.out.println("------ 按下宏命令关闭按钮 ------");
        remoteControl.offButtonWasPushed(0);

        /*
            运行结果：
            ------ 按下宏命令开启按钮 ------
            已开灯
            设置CD
            开启音响
            设置音量：11
            车库门升起
            ------ 按下宏命令关闭按钮 ------
            已关灯
            设置CD
            关闭音响
            设置音量：0
            车库门下降
         */
    }

}
