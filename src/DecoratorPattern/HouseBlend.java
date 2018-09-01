package DecoratorPattern;

/**
 * @author lkmc2
 * @date 2018/9/1
 * @description 家庭搅拌饮料
 */

public class HouseBlend extends Beverage {

    public HouseBlend() {
        setMilk(true);
        setMocha(true);
    }

    @Override
    public String getDescription() {
        return "家庭搅拌饮料";
    }

}
