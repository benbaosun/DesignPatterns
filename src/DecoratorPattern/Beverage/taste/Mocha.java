package DecoratorPattern.Beverage.taste;

import DecoratorPattern.Beverage.drink.Beverage;

/**
 * @author lkmc2
 * @date 2018/9/1
 * @description 摩卡（装饰器）
 */
public class Mocha extends CondimentDecorator {

    private Beverage beverage; // 饮料（使用组合方式引入变量）

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "，摩卡";
    }

    @Override
    public double cost() {
        return 5 + beverage.cost();
    }

}
