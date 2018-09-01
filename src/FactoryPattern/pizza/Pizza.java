package FactoryPattern.pizza;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lkmc2
 * @date 2018/9/1
 * @description 披萨
 */
public class Pizza {
    protected String name; // 披萨名
    protected String dough; // 面团类型
    protected String sauce; // 酱料类型
    protected List<String> toppings = new ArrayList<>(); // 佐料列表

    public void prepare() {
        System.out.println("开始准备 " + name);
        System.out.println("柔面团... ");
        System.out.println("添加酱料... ");
        System.out.println("添加佐料... ");

        for (String topping : toppings) {
            System.out.println(topping);
        }
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

    public String getName() {
        return name;
    }

}
