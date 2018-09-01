package DecoratorPattern.Beverage.size;

import DecoratorPattern.Beverage.drink.Beverage;

/**
 * @author lkmc2
 * @date 2018/9/1
 * @description 小杯饮料（装饰器）
 */
public class SmallCup extends CupSizeDecorator {
    private Beverage beverage; // 饮料（使用组合方式引入变量）

    public SmallCup(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "，小杯";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0;
    }
    
}
