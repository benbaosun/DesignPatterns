package FactoryPattern.store;

import FactoryPattern.factory.NYPizzaIngredientFactory;
import FactoryPattern.factory.PizzaIngredientFactory;
import FactoryPattern.pizza.*;

/**
 * @author lkmc2
 * @date 2018/9/1
 * @description 纽约风格披萨商店（工厂模式）
 */
public class NYStylePizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null; // 披萨
        // 纽约披萨原料工厂
        PizzaIngredientFactory factory = new NYPizzaIngredientFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(factory); // 芝士披萨
            pizza.setName("纽约芝士披萨");
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza(factory); // 蔬菜披萨
            pizza.setName("纽约蔬菜披萨");
        } else if (type.equals("clam")) {
            pizza = new ClamsPizza(factory); // 蛤蜊披萨
            pizza.setName("纽约蛤蜊披萨");
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza(factory); // 意大利辣肠披萨
            pizza.setName("纽约意大利辣肠披萨");
        }

        return pizza;
    }
}
