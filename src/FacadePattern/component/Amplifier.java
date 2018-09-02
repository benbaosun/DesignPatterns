package FacadePattern.component;

/**
 * @author lkmc2
 * @date 2018/9/2
 * @description 扬声器
 */
public class Amplifier {

    public void on() {
        System.out.println("打开扬声器");
    }

    public void off() {
        System.out.println("关闭扬声器");
    }

    public void setDvdPlayer(DvdPlayer dvdPlayer) {
        System.out.println("扬声器设置DVD播放器");
    }

    public void setSurroundSound() {
        System.out.println("扬声器设置环绕音");
    }

    public void setVolume(int level) {
        System.out.println("扬声器设置音量：" + level);
    }
}
