package FactoryPattern.factory;

import FactoryPattern.pizza.CheesePizza;
import FactoryPattern.pizza.GreekPizza;
import FactoryPattern.pizza.PepperoniPizza;
import FactoryPattern.pizza.Pizza;

/**
 * @author lkmc2
 * @date 2018/9/1
 * @description 简单工厂模式
 */
public class SimplePizzaFactory {

    // 根据不同的类型创建披萨
    public Pizza createPizza(String type) {
        Pizza pizza;

        if (type.equals("cheese")) {
            pizza = new CheesePizza(); // 芝士披萨
        } else if (type.equals("greek")) {
            pizza = new GreekPizza(); // 希腊披萨
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza(); // 意大利辣肠披萨
        } else {
            pizza = new Pizza(); // 经典披萨
        }

        return pizza;
    }

}
