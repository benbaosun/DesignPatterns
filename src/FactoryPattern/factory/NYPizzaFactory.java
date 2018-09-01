package FactoryPattern.factory;

import FactoryPattern.pizza.CheesePizza;
import FactoryPattern.pizza.GreekPizza;
import FactoryPattern.pizza.PepperoniPizza;
import FactoryPattern.pizza.Pizza;

/**
 * @author lkmc2
 * @date 2018/9/1
 * @description 纽约披萨工厂
 */
public class NYPizzaFactory extends SimplePizzaFactory {

    // 根据不同的类型创建披萨
    public Pizza createPizza(String type) {
        System.out.println("加入番茄风味...");
        return super.createPizza(type);
    }

}
