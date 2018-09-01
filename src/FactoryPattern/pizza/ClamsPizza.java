package FactoryPattern.pizza;

import FactoryPattern.factory.PizzaIngredientFactory;

/**
 * @author lkmc2
 * @date 2018/9/1
 * @description 蛤蜊披萨
 */
public class ClamsPizza extends Pizza {
    private PizzaIngredientFactory ingredientFactory; // 披萨原料工厂

    public ClamsPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("正在准备 " + name);

        dough = ingredientFactory.createDough(); // 添加面团
        sauce = ingredientFactory.createSauce(); // 添加酱料
        cheese = ingredientFactory.createCheese(); // 添加奶酪
        veggies = ingredientFactory.createVeggies(); // 添加蔬菜
    }

}
