package FactoryPattern.pizza.nystyle;

import FactoryPattern.pizza.Pizza;

/**
 * @author lkmc2
 * @date 2018/9/1
 * @description 纽约风格芝士披萨
 */
public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza() {
        name = "纽约风格芝士披萨";
        dough = "粗面";
        sauce = "加拿大酱";

        toppings.add("高级奶酪");
        toppings.add("曲奇");
    }

}
