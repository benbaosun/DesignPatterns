package CommandPattern;

import CommandPattern.command.fan.CeilingFanHighCommand;
import CommandPattern.command.fan.CeilingFanLowCommand;
import CommandPattern.command.fan.CeilingFanMediumCommand;
import CommandPattern.command.fan.CeilingFanOffCommand;
import CommandPattern.component.CeilingFan;
import CommandPattern.remote.RemoteControlWithUndo;

/**
 * @author lkmc2
 * @date 2018/9/2
 * @description 电风扇遥控器测试
 */
public class RemoteCeilingFanTest {

    public static void main(String[] args) {
        CeilingFan ceilingFan = new CeilingFan("客厅");

        CeilingFanLowCommand ceilingFanLow = new CeilingFanLowCommand(ceilingFan);
        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        // 遥控器
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        // 为遥控器的指定插槽设置对应的开、关事件
        remoteControl.setCommand(0, ceilingFanLow, ceilingFanOff);
        remoteControl.setCommand(1, ceilingFanMedium, ceilingFanOff);
        remoteControl.setCommand(2, ceilingFanHigh, ceilingFanOff);

        // 打印遥控器中的命令信息
        System.out.println(remoteControl);

        /*
            运行结果：
            ----- 遥控器 -----
            插槽[0] CeilingFanLowCommand CeilingFanOffCommand
            插槽[1] CeilingFanMediumCommand CeilingFanOffCommand
            插槽[2] CeilingFanHighCommand CeilingFanOffCommand
            插槽[3] NoCommand NoCommand
            插槽[4] NoCommand NoCommand
            插槽[5] NoCommand NoCommand
            插槽[6] NoCommand NoCommand
         */
        // 分别按下对应插槽的开、关按钮
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        printDivideLine();

        // 撤销上一步的操作
        remoteControl.undoButtonWasPushed();
        printDivideLine();

        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        printDivideLine();

        remoteControl.undoButtonWasPushed();
        printDivideLine();

        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        printDivideLine();

        remoteControl.undoButtonWasPushed();

        /*
            运行结果：
            打开风扇低速档
            已关风扇
            -----------------------------
            [撤销上一步操作]
            打开风扇低速档
            -----------------------------
            打开风扇高速档
            已关风扇
            -----------------------------
            [撤销上一步操作]
            打开风扇高速档
            -----------------------------
            打开风扇高速档
            已关风扇
            -----------------------------
            [撤销上一步操作]
            打开风扇高速档
         */
    }

    // 打印分隔线
    private static void printDivideLine() {
        System.out.println("-----------------------------");
    }

}
