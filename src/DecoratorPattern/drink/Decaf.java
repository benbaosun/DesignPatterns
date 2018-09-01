package DecoratorPattern.drink;

/**
 * @author lkmc2
 * @date 2018/9/1
 * @description 咖啡因饮料
 */

public class Decaf extends Beverage {

    public Decaf() {
        description = "咖啡因饮料";
    }

    @Override
    public double cost() {
        return 16;
    }

}
