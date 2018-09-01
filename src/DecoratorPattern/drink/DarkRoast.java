package DecoratorPattern.drink;

/**
 * @author lkmc2
 * @date 2018/9/1
 * @description 深度烘焙饮料
 */

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "深度烘焙饮料";
    }

    @Override
    public double cost() {
        return 11;
    }

}
