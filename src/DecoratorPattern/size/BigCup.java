package DecoratorPattern.size;

import DecoratorPattern.drink.Beverage;

/**
 * @author lkmc2
 * @date 2018/9/1
 * @description 大杯饮料（装饰器）
 */
public class BigCup extends CupSizeDecorator {
    private Beverage beverage; // 饮料（使用组合方式引入变量）

    public BigCup(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "，大杯";
    }

    @Override
    public double cost() {
        return beverage.cost() + 3;
    }

}
