package FacadePattern.component;

/**
 * @author lkmc2
 * @date 2018/9/2
 * @description 投影仪
 */
public class Projector {

    public void on() {
        System.out.println("打开投影仪");
    }

    public void off() {
        System.out.println("关闭投影仪");
    }

    public void wideScreenMode() {
        System.out.println("投影仪启动宽屏模式");
    }
}
