package DecoratorPattern.Beverage.taste;

import DecoratorPattern.Beverage.drink.Beverage;

/**
 * @author lkmc2
 * @date 2018/9/1
 * @description 牛奶（装饰器）
 */
public class Milk extends CondimentDecorator {
    
    private Beverage beverage; // 饮料（使用组合方式引入变量）

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "，牛奶";
    }

    @Override
    public double cost() {
        return 3 + beverage.cost();
    }
    
}
