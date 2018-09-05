package CompoundPattern.MVCPlayer.controller;

import CompoundPattern.MVCPlayer.adapter.HeartAdapter;
import CompoundPattern.MVCPlayer.model.HeartModelInterface;
import CompoundPattern.MVCPlayer.view.DJView;

/**
 * @author lkmc2
 * @date 2018/9/5
 * @description 心跳控制器
 */
public class HeartController implements ControllerInterface {
    private HeartModelInterface model; // 心跳模型接口
    private DJView view; // 播放器界面

    public HeartController(HeartModelInterface model) {
        this.model = model;

        // 创建播放器界面
        view = new DJView(this, new HeartAdapter(model));
        view.createView(); // 创建界面
        view.createControls(); // 创建控件
        view.disableStopMenuItem(); // 禁用停止键
        view.enableStartMenuItem(); // 启用开始键
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void setBPM(int bpm) {

    }

    @Override
    public void increaseBPM() {

    }

    @Override
    public void decreaseBPM() {

    }
}
