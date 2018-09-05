package CompoundPattern.MVCPlayer.model;

import CompoundPattern.MVCPlayer.observer.BPMObserver;
import CompoundPattern.MVCPlayer.observer.BeatObserver;

/**
 * @author lkmc2
 * @date 2018/9/5
 * @description
 */
public interface HeartModelInterface {
    // 获取心跳频率
    int getHeartRate();
    // 注册节拍观察者
    void registerBeatObserver(BeatObserver observer);
    // 移除节拍观察者
    void removeObserver(BeatObserver observer);
    // 注册每分钟节拍观察者
    void registerObserver(BPMObserver observer);
    // 移除每分钟节拍观察者
    void removeObserver(BPMObserver observer);
}
