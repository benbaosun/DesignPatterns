package FactoryPattern.pizza;

import FactoryPattern.factory.PizzaIngredientFactory;

/**
 * @author lkmc2
 * @date 2018/9/1
 * @description 意大利辣肠披萨
 */
public class PepperoniPizza extends Pizza {
    private PizzaIngredientFactory ingredientFactory; // 披萨原料工厂

    public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("正在准备 " + name);

        dough = ingredientFactory.createDough(); // 添加面团
        sauce = ingredientFactory.createSauce(); // 添加酱料
        cheese = ingredientFactory.createCheese(); // 添加奶酪
        pepperoni = ingredientFactory.createPepperoni(); // 添加意大利辣肠
    }

}
