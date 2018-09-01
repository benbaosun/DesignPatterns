package DecoratorPattern.size;

import DecoratorPattern.drink.Beverage;

/**
 * @author lkmc2
 * @date 2018/9/1
 * @description 中杯饮料（装饰器）
 */
public class MiddleCup extends CupSizeDecorator {
    private Beverage beverage; // 饮料（使用组合方式引入变量）

    public MiddleCup(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "，中杯";
    }

    @Override
    public double cost() {
        return beverage.cost() + 2;
    }
    
}
