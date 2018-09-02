package CommandPattern.component;

/**
 * @author lkmc2
 * @date 2018/9/2
 * @description 吊扇
 */
public class CeilingFan {
    private String name; // 地点名

    public CeilingFan() {
    }

    public CeilingFan(String name) {
        this.name = name;
    }

    // 开灯
    public void on() {
        System.out.println("已开风扇");
    }

    // 关灯
    public void off() {
        System.out.println("已关风扇");
    }

}
