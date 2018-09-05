package CompoundPattern.ServletDemo.model;

import CompoundPattern.ServletDemo.observer.BPMObserver;
import CompoundPattern.ServletDemo.observer.BeatObserver;

/**
 * @author lkmc2
 * @date 2018/9/4
 * @description 节拍模型接口
 */
public interface BeatModelInterface {
    // 初始化
    void initialize();

    // 启动
    void on();

    // 关闭
    void off();

    // 设置节拍
    void setBPM(int bpm);

    // 获取节拍
    int getBPM();

    // 注册节拍观察者
    void registerObserver(BeatObserver observer);

    // 移除节拍观察者
    void removeObserver(BeatObserver observer);

    // 注册每分钟节拍观察者
    void registerObserver(BPMObserver observer);

    // 移除每分钟节拍观察者
    void removeObserver(BPMObserver observer);
}
