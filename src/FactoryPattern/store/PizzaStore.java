package FactoryPattern.store;

import FactoryPattern.factory.SimplePizzaFactory;
import FactoryPattern.pizza.Pizza;

/**
 * @author lkmc2
 * @date 2018/9/1
 * @description 披萨商店
 */
public abstract class PizzaStore {

    // 预定披萨
    public Pizza orderPizza(String type) {
        Pizza pizza;

        // 根据不同的类型创建披萨
        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    // 根据类型创建披萨
    protected abstract Pizza createPizza(String type);

}
