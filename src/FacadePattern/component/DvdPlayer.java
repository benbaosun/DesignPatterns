package FacadePattern.component;

/**
 * @author lkmc2
 * @date 2018/9/2
 * @description DVD播放器
 */
public class DvdPlayer {

    public void on() {
        System.out.println("打开DVD播放器");
    }

    public void off() {
        System.out.println("关闭DVD播放器");
    }

    public void play(String movieName) {
        System.out.println("DVD播放器正在播放：" + movieName);
    }

    public void stop() {
        System.out.println("DVD播放器暂停播放");
    }

    public void eject() {
        System.out.println("DVD播放器弹出碟片");
    }
}
