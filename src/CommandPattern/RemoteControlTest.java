package CommandPattern;

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

        // 遥控器
        SimpleRemoteControl remote = new SimpleRemoteControl();
        // 设置命令为开灯
        remote.setCommand(lightOn);
        // 按钮执行按钮
        remote.buttonWasPressed();

        /*
            运行结果：
            已开灯
         */
    }

}
