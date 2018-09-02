package CommandPattern.command.stereo;

import CommandPattern.command.Command;
import CommandPattern.component.Stereo;

/**
 * @author lkmc2
 * @date 2018/9/2
 * @description 音响用CD打开命令
 */
public class StereoOnWithCDCommand implements Command {
    private Stereo stereo; // 音响

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.setCd(); // 设置cd
        stereo.on(); // 打开音响
        stereo.setVolume(11); // 设置音量
    }
}
