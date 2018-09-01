package FactoryPattern.pizza.nystyle;

import FactoryPattern.pizza.Pizza;

/**
 * @author lkmc2
 * @date 2018/9/1
 * @description 纽约风格意大利辣肠披萨
 */
public class NYStylePepperoniPizza extends Pizza {

    public NYStylePepperoniPizza() {
        name = "纽约风格意大利辣肠披萨";
        dough = "粗面";
        sauce = "加拿大酱";

        toppings.add("高级奶酪");
        toppings.add("曲奇");
    }
}
