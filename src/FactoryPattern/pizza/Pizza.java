package FactoryPattern.pizza;

import FactoryPattern.ingredient.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lkmc2
 * @date 2018/9/1
 * @description 披萨
 */
public abstract class Pizza {
    protected String name; // 披萨名
    protected Dough dough; // 面团
    protected Sauce sauce; // 酱料
    protected Veggies[] veggies; // 蔬菜数组
    protected Cheese cheese; // 奶酪
    protected Pepperoni pepperoni; // 意大利辣肠
    protected Clams clams; // 蛤蜊

    // 准备工作
    public abstract void prepare();

    public void bake() {
        System.out.println("正在烘焙...");
    }

    public void cut() {
        System.out.println("正在裁切...");
    }

    public void box() {
        System.out.println("正在装箱...");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough=" + dough +
                ", sauce=" + sauce +
                ", veggies=" + Arrays.toString(veggies) +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", clams=" + clams +
                '}';
    }
}
