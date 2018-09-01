package FactoryPattern;

/**
 * @author lkmc2
 * @date 2018/9/1
 * @description 披萨商店
 */
public class PizzaStore {

    // 预定披萨
    public Pizza orderPizza(String type) {
        Pizza pizza;

        if (type.equals("cheese")) {
            pizza = new CheesePizza(); // 芝士披萨
        } else if (type.equals("greek")) {
            pizza = new GreekPizza(); // 希腊披萨
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza(); // 意大利辣肠披萨
        } else {
            pizza = new Pizza();
        }

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

}
