package CommandPattern.component;

/**
 * @author lkmc2
 * @date 2018/9/2
 * @description 音响
 */
public class Stereo {
    private String location; // 地点名

    public Stereo() {
    }

    public Stereo(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println("开启音响");
    }

    public void off() {
        System.out.println("关闭音响");
    }

    public void setCd() {
        System.out.println("设置CD");
    }

    public void setDvd() {
        System.out.println("设置DVD");
    }

    public void setRadio() {
        System.out.println("设置广播");
    }

    public void setVolume(int volume) {
        System.out.println("设置音量：" + volume);
    }

}
