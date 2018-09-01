package FactoryPattern;

/**
 * @author lkmc2
 * @date 2018/9/1
 * @description 披萨商店
 */
public class PizzaStore {

    // 预定披萨
    public Pizza orderPizza() {
        Pizza pizza = new Pizza();

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

}
