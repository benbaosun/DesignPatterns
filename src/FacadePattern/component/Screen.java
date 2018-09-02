package FacadePattern.component;

/**
 * @author lkmc2
 * @date 2018/9/2
 * @description 影院屏幕
 */
public class Screen {

    public void on() {
        System.out.println("打开影院屏幕");
    }

    public void off() {
        System.out.println("关闭影院屏幕");
    }

    public void down() {
        System.out.println("屏幕下降");
    }

    public void up() {
        System.out.println("屏幕升起");
    }
}
