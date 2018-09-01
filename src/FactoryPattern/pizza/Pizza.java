package FactoryPattern.pizza;

/**
 * @author lkmc2
 * @date 2018/9/1
 * @description 披萨
 */
public class Pizza {

    protected String name = "经典披萨"; // 披萨名

    public String getName() {
        return name;
    }

    public void prepare() {
        System.out.println("开始准备...");
    }

    public void bake() {
        System.out.println("正在烘焙...");
    }

    public void cut() {
        System.out.println("正在裁切...");
    }

    public void box() {
        System.out.println("正在装箱...");
    }

}
