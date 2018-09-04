package CompoundPattern.MVCPlayer.model;

import javax.sound.midi.MetaEventListener;
import javax.sound.midi.MetaMessage;
import javax.sound.midi.Sequencer;
import java.util.ArrayList;
import java.util.List;

/**
 * @author lkmc2
 * @date 2018/9/4
 * @description 节拍模型
 */
public class BeatModel implements BeatModelInterface, MetaEventListener {
    private Sequencer sequencer; // 定序器（用来产生节拍）
    private List<BeatObserver> beatObservers = new ArrayList<>(); // 节拍观察者列表
    private List<BPMObserver> bpmObservers = new ArrayList<>(); // 每分钟节拍观察者列表
    private int bpm = 90; // 每分钟节拍数

    @Override
    public void initialize() {
        setUpMidi(); // 设置节拍的MIDI
        buildTrackAndStart(); // 创建音轨并开始
    }

    // 设置节拍的MIDI
    private void setUpMidi() {

    }

    // 创建音轨并开始
    private void buildTrackAndStart() {

    }

    @Override
    public void on() {
        sequencer.start(); // 启动定序器
        setBPM(90); // 设置每分钟节拍数
    }

    @Override
    public void off() {
        setBPM(0); // 设置每分钟节拍数
    }

    @Override
    public void setBPM(int bpm) {
        this.bpm = bpm;
        sequencer.stop(); // 停止定序器
    }

    @Override
    public int getBPM() {
        return bpm;
    }

    // 节拍事件
    public void beatEvent() {
        notifyBeatObservers();
    }

    // 通知节拍事件观察者
    private void notifyBeatObservers() {
        for (BeatObserver beatObserver : beatObservers) {
            beatObserver.updateBeat(); // 更新
        }

        for (BPMObserver bpmObserver : bpmObservers) {
            bpmObserver.updateBPM(); // 更新
        }
    }

    @Override
    public void registerObserver(BeatObserver observer) {
        beatObservers.add(observer);
    }

    @Override
    public void removeObserver(BeatObserver observer) {
        beatObservers.remove(observer);
    }

    @Override
    public void registerObserver(BPMObserver observer) {
        bpmObservers.add(observer);
    }

    @Override
    public void removeObserver(BPMObserver observer) {
        bpmObservers.remove(observer);
    }

    @Override
    public void meta(MetaMessage meta) {

    }
}
