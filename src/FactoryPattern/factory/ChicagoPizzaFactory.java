package FactoryPattern.factory;

import FactoryPattern.pizza.Pizza;

/**
 * @author lkmc2
 * @date 2018/9/1
 * @description 芝加哥披萨工厂
 */
public class ChicagoPizzaFactory extends SimplePizzaFactory {

    // 根据不同的类型创建披萨
    public Pizza createPizza(String type) {
        System.out.println("加入火龙果风味...");
        return super.createPizza(type);
    }
    
}
