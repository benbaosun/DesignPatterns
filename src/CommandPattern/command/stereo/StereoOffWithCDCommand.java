package CommandPattern.command.stereo;

import CommandPattern.command.Command;
import CommandPattern.component.Stereo;

/**
 * @author lkmc2
 * @date 2018/9/2
 * @description 音响用CD关闭命令
 */
public class StereoOffWithCDCommand implements Command {
    private Stereo stereo; // 音响

    public StereoOffWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.setCd(); // 设置cd
        stereo.off(); // 关闭音响
        stereo.setVolume(0); // 设置音量
    }
}
