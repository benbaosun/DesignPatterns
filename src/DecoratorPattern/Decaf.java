package DecoratorPattern;

/**
 * @author lkmc2
 * @date 2018/9/1
 * @description 咖啡因饮料
 */

public class Decaf extends Beverage {

    public Decaf() {
        setMilk(true);
        setWhip(true);
    }

    @Override
    public String getDescription() {
        return "咖啡因饮料";
    }

}
