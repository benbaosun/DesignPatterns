package DecoratorPattern;

/**
 * @author lkmc2
 * @date 2018/9/1
 * @description 浓咖啡饮料
 */

public class Espresso extends Beverage {

    public Espresso() {
        setMilk(true);
        setMocha(true);
        setWhip(true);
    }

    @Override
    public String getDescription() {
        return "浓咖啡饮料";
    }

}
