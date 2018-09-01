package DecoratorPattern.Beverage.taste;

import DecoratorPattern.Beverage.drink.Beverage;

/**
 * @author lkmc2
 * @date 2018/9/1
 * @description 奶泡（装饰器）
 */
public class Whip extends CondimentDecorator {

    private Beverage beverage; // 饮料（使用组合方式引入变量）

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "，奶泡";
    }

    @Override
    public double cost() {
        return 2 + beverage.cost();
    }

}
