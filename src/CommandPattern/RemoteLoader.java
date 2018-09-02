package CommandPattern;

import CommandPattern.command.garage.GarageDoorCloseCommand;
import CommandPattern.command.garage.GarageDoorOpenCommand;
import CommandPattern.command.light.LightOffCommand;
import CommandPattern.command.light.LightOnCommand;
import CommandPattern.command.stereo.StereoOffWithCDCommand;
import CommandPattern.command.stereo.StereoOnWithCDCommand;
import CommandPattern.component.CeilingFan;
import CommandPattern.component.GarageDoor;
import CommandPattern.component.Light;
import CommandPattern.component.Stereo;
import CommandPattern.remote.RemoteControlWithUndo;

/**
 * @author lkmc2
 * @date 2018/9/2
 * @description 遥控器测试
 */
public class RemoteLoader {

    public static void main(String[] args) {
        // 将所有的装置创建在合适的位置
        Light livingRoomLight = new Light("客厅"); // 灯泡
        Light kitchenLight = new Light("厨房");
        CeilingFan ceilingFan = new CeilingFan("客厅"); // 吊扇
        GarageDoor garageDoor = new GarageDoor("车库");  // 车库门
        Stereo stereo = new Stereo("卧室");  // 音响

        // 创建所有的电灯命令（开、关）对象
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        // 创建车库门命令（开、关）对象
        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorClose = new GarageDoorCloseCommand(garageDoor);

        // 创建音响命令（开、关）对象
        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffWithCDCommand stereoOffWithCD = new StereoOffWithCDCommand(stereo);

        // 遥控器
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        // 设置遥控器插槽上对应位置的开关事件
        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(3, garageDoorOpen, garageDoorClose);
        remoteControl.setCommand(4, stereoOnWithCD, stereoOffWithCD);

        // 打印遥控器中插槽的内容
        System.out.println(remoteControl);

        /*
            运行结果：
            ----- 遥控器 -----
            插槽[0] LightOnCommand LightOffCommand
            插槽[1] LightOnCommand LightOffCommand
            插槽[2] CeilingFanOnCommand CeilingFanOffCommand
            插槽[3] GarageDoorOpenCommand GarageDoorCloseCommand
            插槽[4] StereoOnWithCDCommand StereoOffWithCDCommand
            插槽[5] NoCommand NoCommand
            插槽[6] NoCommand NoCommand
         */

        // 分别按下对应插槽的开、关按钮
        remoteControl.onButtonWasPushed(0); // 按下0插槽的开按钮
        remoteControl.offButtonWasPushed(0);  // 按下0插槽的关按钮
        printDivideLine();

        // 按下撤销上一步按钮
        remoteControl.undoButtonWasPushed();
        printDivideLine();

        remoteControl.onButtonWasPushed(2);
        printDivideLine();

        // 按下撤销上一步按钮
        remoteControl.undoButtonWasPushed();
        printDivideLine();

        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
        printDivideLine();

        remoteControl.onButtonWasPushed(4);
        remoteControl.offButtonWasPushed(4);

        /*
            运行结果：
            已开灯
            已关灯
            -----------------------------
            [撤销上一步操作]
            已开灯
            -----------------------------
            已开风扇
            -----------------------------
            [撤销上一步操作]
            已关风扇
            -----------------------------
            车库门升起
            车库门下降
            -----------------------------
            设置CD
            开启音响
            设置音量：11
            设置CD
            关闭音响
            设置音量：0
         */
    }

    // 打印分隔线
    private static void printDivideLine() {
        System.out.println("-----------------------------");
    }

}
