package FactoryPattern.pizza.chicagostyle;

import FactoryPattern.pizza.Pizza;

/**
 * @author lkmc2
 * @date 2018/9/1
 * @description 芝加哥风格意大利辣肠披萨
 */
public class ChicagoStylePepperoniPizza extends Pizza {

    public ChicagoStylePepperoniPizza() {
        name = "芝加哥风格意大利辣肠披萨";
        dough = "细面";
        sauce = "美国酱";

        toppings.add("黑巧克力");
        toppings.add("草莓");
    }

    @Override
    public void cut() {
        System.out.println("正在裁切（正方型）...");
    }

}
