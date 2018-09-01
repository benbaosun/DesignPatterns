package FactoryPattern.factory;

import FactoryPattern.ingredient.*;

/**
 * @author lkmc2
 * @date 2018/9/1
 * @description 披萨原料工厂（抽象工厂接口）
 */
public interface PizzaIngredientFactory {
    Dough createDough(); // 添加面团
    Sauce createSauce(); // 添加酱料
    Cheese createCheese(); // 添加奶酪
    Veggies[] createVeggies(); // 添加蔬菜
    Pepperoni createPepperoni(); // 添加意大利辣肠
    Clams createClams(); // 添加蛤蜊
}
