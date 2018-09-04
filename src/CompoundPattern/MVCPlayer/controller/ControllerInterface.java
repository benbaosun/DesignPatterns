package CompoundPattern.MVCPlayer.controller;

/**
 * @author lkmc2
 * @date 2018/9/4
 * @description 控制器接口
 */
public interface ControllerInterface {
    // 启动
    void start();
    // 停止
    void stop();
    // 设置BPM值
    void setBPM(int bpm);
    // BPM增加
    void increaseBPM();
    // BPM减少
    void decreaseBPM();
}
