package DecoratorPattern.taste;

import DecoratorPattern.drink.Beverage;

/**
 * @author lkmc2
 * @date 2018/9/1
 * @description 调料装饰器（抽象类）
 * 继承饮料抽象类
 */

public abstract class CondimentDecorator extends Beverage {
    // 获取调料描述
    public abstract String getDescription();
}
