package FactoryPattern;

import FactoryPattern.factory.NYPizzaFactory;
import FactoryPattern.factory.SimplePizzaFactory;
import FactoryPattern.pizza.Pizza;

/**
 * @author lkmc2
 * @date 2018/9/1
 * @description 工厂模式测试类
 */
public class TestMain {

    public static void main(String[] args) {
        // 简单披萨工厂
        SimplePizzaFactory factory = new NYPizzaFactory();

        // 披萨商店
        PizzaStore pizzaStore = new PizzaStore(factory);
        // 预定披萨
        Pizza pizza = pizzaStore.orderPizza("greek");

        System.out.println(pizza.getName() + "已送达");

        /*
            运行结果：
            加入番茄风味...
            开始准备...
            正在烘焙...
            正在裁切...
            正在装箱...
            希腊披萨已送达
         */
    }

}
