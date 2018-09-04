package CompoundPattern.MVCPlayer;

import CompoundPattern.MVCPlayer.controller.BeatController;
import CompoundPattern.MVCPlayer.controller.ControllerInterface;
import CompoundPattern.MVCPlayer.model.BeatModel;
import CompoundPattern.MVCPlayer.model.BeatModelInterface;

/**
 * @author lkmc2
 * @date 2018/9/4
 * @description BPM播放器测试
 */
public class BPMPlayerTest {

    public static void main(String[] args) {
        // 节拍模型
        BeatModelInterface model = new BeatModel();

        // 节拍控制器
        ControllerInterface controller = new BeatController(model);
    }

}
