package CompoundPattern.MVCPlayer.model;

import CompoundPattern.MVCPlayer.observer.BPMObserver;
import CompoundPattern.MVCPlayer.observer.BeatObserver;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lkmc2
 * @date 2018/9/5
 * @description 心跳模型
 */
public class HeartModel implements HeartModelInterface  {
    private int heartRate = 100; // 心跳频率
    private List<BeatObserver> beatObservers = new ArrayList<>(); // 节拍观察者列表
    private List<BPMObserver> bpmObservers = new ArrayList<>(); // BPM观察者列表

    @Override
    public int getHeartRate() {
        return heartRate;
    }

    @Override
    public void registerBeatObserver(BeatObserver observer) {
        // 节拍观察者添加到列表
        beatObservers.add(observer);
    }

    @Override
    public void removeObserver(BeatObserver observer) {
        // 移除观察者
        beatObservers.remove(observer);
    }

    @Override
    public void registerObserver(BPMObserver observer) {
        // BPM观察者添加到列表
        bpmObservers.add(observer);
    }

    @Override
    public void removeObserver(BPMObserver observer) {
        // 移除观察者
        bpmObservers.remove(observer);
    }

}
