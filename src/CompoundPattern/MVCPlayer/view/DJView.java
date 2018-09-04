package CompoundPattern.MVCPlayer.view;

import CompoundPattern.MVCPlayer.controller.ControllerInterface;
import CompoundPattern.MVCPlayer.model.BPMObserver;
import CompoundPattern.MVCPlayer.model.BeatModelInterface;
import CompoundPattern.MVCPlayer.model.BeatObserver;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author lkmc2
 * @date 2018/9/4
 * @description 播放器界面
 */
public class DJView implements ActionListener, BeatObserver, BPMObserver {
    private BeatModelInterface model; // 节拍模型接口
    private ControllerInterface controller; // 控制器接口
    private JFrame viewFrame; // 界面主窗体
    private JFrame viewPanel; // 界面主面板
    private BeatBar beatBar; // 节拍条
    private JLabel bpmOutputLabel; // 每分钟节拍输出标签

    public DJView(ControllerInterface controller, BeatModelInterface model) {
        this.controller = controller;
        this.model = model;

        // 为模型注册节拍观察者和每分钟节拍观察者
        model.registerObserver((BeatObserver) this);
        model.registerObserver((BPMObserver) this);
    }

    // 创建界面
    public void createView() {

    }

    @Override
    public void actionPerformed(ActionEvent event) {

    }

    @Override
    public void updateBPM() {
        int bpm = model.getBPM();

        if (bpm == 0) {
            bpmOutputLabel.setText("离线");
        } else {
            bpmOutputLabel.setText("当前BPM为：" + bpm);
        }
    }

    @Override
    public void updateBeat() {
        beatBar.setValue(100); // 设置节拍条的值
    }
}
