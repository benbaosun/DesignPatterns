package DecoratorPattern.Beverage.taste;

import DecoratorPattern.Beverage.drink.Beverage;

/**
 * @author lkmc2
 * @date 2018/9/1
 * @description 豆浆（装饰器）
 */
public class Soy extends CondimentDecorator {

    private Beverage beverage; // 饮料（使用组合方式引入变量）

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "，豆浆";
    }

    @Override
    public double cost() {
        return 4 + beverage.cost();
    }

}
