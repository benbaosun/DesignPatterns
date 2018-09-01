package DecoratorPattern.Beverage.size;

import DecoratorPattern.Beverage.drink.Beverage;

/**
 * @author lkmc2
 * @date 2018/9/1
 * @description 杯子大小（装饰器抽象类）
 */
public abstract class CupSizeDecorator extends Beverage {
    // 获取杯子大小描述
    public abstract String getDescription();
}
