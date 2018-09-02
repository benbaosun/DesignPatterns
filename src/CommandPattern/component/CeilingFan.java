package CommandPattern.component;

/**
 * @author lkmc2
 * @date 2018/9/2
 * @description 吊扇
 */
public class CeilingFan {
    public static final int HIGH = 3; // 高速档
    public static final int MEDIUM = 2; // 中速挡
    public static final int LOW = 1; // 低速档
    public static final int OFF = 0; // 关闭风扇

    private String location; // 地点名
    private int speed; // 风速

    public CeilingFan() {
    }

    public CeilingFan(String location) {
        this.location = location;
        speed = OFF; // 设置风速为0
    }

    public void high() {
        speed = HIGH;
        System.out.println("打开风扇高速档");
    }

    public void medium() {
        speed = MEDIUM;
        System.out.println("打开风扇中速档");
    }

    public void low() {
        speed = LOW;
        System.out.println("打开风扇低速档");
    }

    public void off() {
        speed = OFF;
        System.out.println("已关风扇");
    }

    // 获取风速
    public int getSpeed() {
        return speed;
    }
}
