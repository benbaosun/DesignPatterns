package CompoundPattern.MVCPlayer.view;

import CompoundPattern.MVCPlayer.controller.ControllerInterface;
import CompoundPattern.MVCPlayer.model.BPMObserver;
import CompoundPattern.MVCPlayer.model.BeatModelInterface;
import CompoundPattern.MVCPlayer.model.BeatObserver;

import javax.swing.*;
import java.awt.*;
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

    private JFrame viewFrame; // 控制器主面板
    private JFrame viewPanel; // 界面主面板
    private BeatBar beatBar; // 节拍条
    private JLabel bpmOutputLabel; // 每分钟节拍输出标签

    private JLabel bpmLabel; // 每分钟节拍标签
    private JTextField bpmTextField; // 每分钟节拍输入框

    private JButton setBPMButton; // 设置BPM的按钮
    private JButton increaseBPMButton; // BPM增加按钮
    private JButton decreaseBPMButton; // BPM减少按钮

    private JMenuBar menuBar; // 菜单栏
    private JMenu menu; // 菜单项
    private JMenuItem startMenuItem; // 开始运行菜单子项
    private JMenuItem stopMenuItem; // 停止运行菜单子项


    public DJView(ControllerInterface controller, BeatModelInterface model) {
        this.controller = controller;
        this.model = model;

        // 为模型注册节拍观察者和每分钟节拍观察者
        model.registerObserver((BeatObserver) this);
        model.registerObserver((BPMObserver) this);
    }

    // 创建界面
    public void createView() {
        viewFrame = new JFrame("控制器");
        viewFrame.setBounds(650, 300, 300, 300);
        viewFrame.setLayout(null);
        viewFrame.setVisible(true);
        viewFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        viewPanel = new JFrame("界面");
        viewPanel.setBounds(300, 300, 300, 150);
        viewPanel.setLayout(null);
        viewPanel.setVisible(true);
        viewPanel.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
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

    // 创建控件
    public void createControls() {
        // 节拍条
        beatBar = new BeatBar();
        beatBar.setMaximum(200);
        beatBar.setBounds(10, 10, 263, 50);
        beatBar.setValue(100);

        // BMP值输出条
        bpmOutputLabel = new JLabel("当前BPM为：" + beatBar.getValue());
        bpmOutputLabel.setBounds(10, 70, 263, 30);

        // 将组件加入界面主面板
        Container contentPane = viewPanel.getContentPane();
        contentPane.add(beatBar);
        contentPane.add(bpmOutputLabel);

        // 标签
        bpmLabel = new JLabel("输入BPM:");
        bpmLabel.setBounds(10, 10, 263, 30);

        // 输入框
        bpmTextField = new JTextField();
        bpmTextField.setBounds(10, 50, 263, 30);

        // 设置按钮
        setBPMButton = new JButton("设置");
        setBPMButton.setBounds(10, 50, 263, 30);

        // 增加按钮
        increaseBPMButton = new JButton("<<");
        increaseBPMButton.setBounds(10, 100, 130, 30);

        // 减少按钮
        decreaseBPMButton = new JButton(">>");
        decreaseBPMButton.setBounds(10, 240, 130, 30);

        // 菜单栏
        menuBar = new JMenuBar();
        menuBar.setBounds(10, 10, 263, 30);

        menu = new JMenu("选项");

        startMenuItem = new JMenuItem("开始");
        stopMenuItem = new JMenuItem("停止");

        menu.add(startMenuItem);
        menu.add(stopMenuItem);

        menuBar.add(menu);

        // 将组件加入控制器主面板
        Container frameContentPane = viewFrame.getContentPane();
        frameContentPane.add(menuBar);
        frameContentPane.add(bpmLabel);
        frameContentPane.add(bpmTextField);
        frameContentPane.add(setBPMButton);
        frameContentPane.add(increaseBPMButton);
        frameContentPane.add(decreaseBPMButton);
    }

    // 启用停止键
    public void enableStopMenuItem() {
        stopMenuItem.setEnabled(true);
    }

    // 禁用停止键
    public void disableStopMenuItem() {
        stopMenuItem.setEnabled(false);
    }

    // 启用开始键
    public void enableStartMenuItem() {
        startMenuItem.setEnabled(true);
    }

    // 禁用开始键
    public void disableStartMenuItem() {
        startMenuItem.setEnabled(false);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        // 获取事件的执行对象
        Object source = event.getSource();

        if (source == setBPMButton) { // 点击设置BPM按钮
            // 获取输入框中的bpm值
            int bpm = Integer.parseInt(bpmTextField.getText());
            // 设置bpm到控制器上
            controller.setBPM(bpm);
        } else if (source == increaseBPMButton) { // 点击BPM增加按钮
            // 设置控制器的BPM增加
            controller.increaseBPM();
        } else if (source == decreaseBPMButton) { // 点击BPM减少按钮
            // 设置控制器上的BPM减少
            controller.decreaseBPM();
        }
    }
}
