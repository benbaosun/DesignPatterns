package DecoratorPattern.drink;

/**
 * @author lkmc2
 * @date 2018/9/1
 * @description 饮料（抽象类）
 */

public abstract class Beverage {
    protected String description = "未知饮料"; // 饮料描述

    // 获取饮料描述
    public String getDescription() {
        return description;
    }

    // 计算饮料总价
    public abstract double cost();
}
