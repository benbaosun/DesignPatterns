package DecoratorPattern.Beverage.drink;

/**
 * @author lkmc2
 * @date 2018/9/1
 * @description 家庭搅拌饮料
 */

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "家庭搅拌饮料";
    }

    @Override
    public double cost() {
        return 13;
    }

}
