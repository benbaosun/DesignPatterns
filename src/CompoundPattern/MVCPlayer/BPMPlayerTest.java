package CompoundPattern.MVCPlayer;

import CompoundPattern.MVCPlayer.controller.BeatController;
import CompoundPattern.MVCPlayer.controller.ControllerInterface;
import CompoundPattern.MVCPlayer.controller.HeartController;
import CompoundPattern.MVCPlayer.model.BeatModel;
import CompoundPattern.MVCPlayer.model.BeatModelInterface;
import CompoundPattern.MVCPlayer.model.HeartModel;
import CompoundPattern.MVCPlayer.model.HeartModelInterface;

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

        // 心跳模型
        HeartModelInterface heartModel = new HeartModel();

        // 心跳控制器
        ControllerInterface heartController = new HeartController(heartModel);
    }

}
