package FactoryPattern.store;

import FactoryPattern.pizza.CheesePizza;
import FactoryPattern.pizza.GreekPizza;
import FactoryPattern.pizza.PepperoniPizza;
import FactoryPattern.pizza.Pizza;
import FactoryPattern.pizza.nystyle.NYStyleCheesePizza;
import FactoryPattern.pizza.nystyle.NYStyleGreekPizza;
import FactoryPattern.pizza.nystyle.NYStylePepperoniPizza;

/**
 * @author lkmc2
 * @date 2018/9/1
 * @description 纽约风格披萨商店
 */
public class NYStylePizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza(); // 芝士披萨
        } else if (type.equals("greek")) {
            return new NYStyleGreekPizza(); // 希腊披萨
        } else if (type.equals("pepperoni")) {
            return new NYStylePepperoniPizza(); // 意大利辣肠披萨
        } else {
           return new Pizza(); // 经典披萨
        }
    }
}
