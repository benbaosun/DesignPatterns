package CompoundPattern.MVCPlayer.controller;

import CompoundPattern.MVCPlayer.model.BeatModelInterface;
import CompoundPattern.MVCPlayer.view.DJView;

/**
 * @author lkmc2
 * @date 2018/9/4
 * @description 节拍控制器
 */
public class BeatController implements ControllerInterface {
    private BeatModelInterface model; // 节拍模型接口
    private DJView view; // 播放器界面

    public BeatController(BeatModelInterface model) {
        this.model = model;

        // 创建播放器界面
        view = new DJView(this, model);
        view.createView(); // 创建界面
        view.createControls(); // 创建控件
        view.disableStopMenuItem(); // 禁用停止键
        view.enableStartMenuItem(); // 启用开始键

        // 模型初始化
        model.initialize();
    }

    @Override
    public void start() {
        model.on(); // 启动模型
        view.disableStartMenuItem(); // 禁用开始键
        view.enableStopMenuItem(); // 启用停止键
    }

    @Override
    public void stop() {
        model.off(); // 关闭模型
        view.disableStopMenuItem(); // 禁用停止键
        view.enableStartMenuItem(); // 启用开始键
    }

    @Override
    public void setBPM(int bpm) {
        model.setBPM(bpm); // 使用模型设置BPM值
    }

    @Override
    public void increaseBPM() {
        // 从模型获取BPM值
        int bpm = model.getBPM();
        // 设置BPM值加1
        model.setBPM(bpm + 1);
    }

    @Override
    public void decreaseBPM() {
        // 从模型获取BPM值
        int bpm = model.getBPM();
        // 设置BPM值减1
        model.setBPM(bpm - 1);
    }
}
