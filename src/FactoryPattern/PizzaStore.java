package FactoryPattern;

/**
 * @author lkmc2
 * @date 2018/9/1
 * @description 披萨商店
 */
public class PizzaStore {
    private SimplePizzaFactory factory; // 简单工厂

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    // 预定披萨
    public Pizza orderPizza(String type) {
        Pizza pizza;

        // 根据不同的类型创建披萨
        pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

}
