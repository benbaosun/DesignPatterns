package FactoryPattern.store;

import FactoryPattern.pizza.Pizza;
import FactoryPattern.pizza.chicagostyle.ChicagoStyleCheesePizza;
import FactoryPattern.pizza.chicagostyle.ChicagoStyleGreekPizza;
import FactoryPattern.pizza.chicagostyle.ChicagoStylePepperoniPizza;

/**
 * @author lkmc2
 * @date 2018/9/1
 * @description 芝加哥风格披萨商店（工厂模式）
 */
public class ChicagoStylePizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza(); // 芝士披萨
        } else if (type.equals("greek")) {
            return new ChicagoStyleGreekPizza(); // 希腊披萨
        } else if (type.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza(); // 意大利辣肠披萨
        } else {
            return new Pizza(); // 经典披萨
        }
    }
}
