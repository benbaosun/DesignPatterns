package CompoundPattern.MVCPlayer.adapter;

import CompoundPattern.MVCPlayer.model.BeatModelInterface;
import CompoundPattern.MVCPlayer.model.HeartModelInterface;
import CompoundPattern.MVCPlayer.observer.BPMObserver;
import CompoundPattern.MVCPlayer.observer.BeatObserver;

/**
 * @author lkmc2
 * @date 2018/9/5
 * @description 心跳适配器
 */
public class HeartAdapter implements BeatModelInterface {
    private HeartModelInterface heart; // 心跳模型接口

    public HeartAdapter(HeartModelInterface heart) {
        this.heart = heart;
    }

    @Override
    public void initialize() {

    }

    @Override
    public void on() {

    }

    @Override
    public void off() {

    }

    @Override
    public void setBPM(int bpm) {

    }

    @Override
    public int getBPM() {
        return heart.getHeartRate();
    }

    @Override
    public void registerObserver(BeatObserver observer) {
        heart.registerBeatObserver(observer);
    }

    @Override
    public void removeObserver(BeatObserver observer) {
        heart.removeObserver(observer);
    }

    @Override
    public void registerObserver(BPMObserver observer) {
        heart.registerObserver(observer);
    }

    @Override
    public void removeObserver(BPMObserver observer) {
        heart.removeObserver(observer);
    }
}
