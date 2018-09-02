package FacadePattern.component;

/**
 * @author lkmc2
 * @date 2018/9/2
 * @description 剧场灯光
 */
public class TheaterLights {

    public void on() {
        System.out.println("打开剧场灯光");
    }

    public void off() {
        System.out.println("关闭剧场灯光");
    }

    public void dim(int level) {
        System.out.println("灯光调暗" + level);
    }
}
