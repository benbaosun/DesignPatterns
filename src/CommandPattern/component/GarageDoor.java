package CommandPattern.component;

/**
 * @author lkmc2
 * @date 2018/9/2
 * @description 车库门
 */
public class GarageDoor {
    private String name; // 地点名

    public GarageDoor() {
    }

    public GarageDoor(String name) {
        this.name = name;
    }

    // 车库门升起
    public void up() {
        System.out.println("车库门升起");
    }

    // 车库门下降
    public void down() {
        System.out.println("车库门下降");
    }

    // 停止升起或下降
    public void stop() {
        System.out.println("停止升起或下降");
    }

    // 车库开灯
    public void lightOn() {
        System.out.println("车库开灯");
    }

    // 车库关灯
    public void lightOff() {
        System.out.println("车库关灯");
    }

}
