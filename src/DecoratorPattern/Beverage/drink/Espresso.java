package DecoratorPattern.Beverage.drink;

/**
 * @author lkmc2
 * @date 2018/9/1
 * @description 浓咖啡饮料
 */

public class Espresso extends Beverage {

    public Espresso() {
        description = "浓咖啡饮料";
    }

    @Override
    public double cost() {
        return 15;
    }

}
