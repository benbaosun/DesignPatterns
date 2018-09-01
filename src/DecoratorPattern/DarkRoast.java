package DecoratorPattern;

/**
 * @author lkmc2
 * @date 2018/9/1
 * @description 深度烘焙饮料
 */

public class DarkRoast extends Beverage {

    public DarkRoast() {
        setMocha(true);
        setSoy(true);
        setWhip(true);
    }

    @Override
    public String getDescription() {
        return "深度烘焙饮料";
    }

}
