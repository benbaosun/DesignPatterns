package DecoratorPattern.Beverage;

import DecoratorPattern.Beverage.drink.*;
import DecoratorPattern.Beverage.size.BigCup;
import DecoratorPattern.Beverage.size.MiddleCup;
import DecoratorPattern.Beverage.size.SmallCup;
import DecoratorPattern.Beverage.taste.Milk;
import DecoratorPattern.Beverage.taste.Mocha;
import DecoratorPattern.Beverage.taste.Soy;
import DecoratorPattern.Beverage.taste.Whip;

/**
 * @author lkmc2
 * @date 2018/9/1
 * @description 装饰者模式测试类
 */

public class MainTest {

    public static void main(String[] args) {
        Beverage darkRoast = new DarkRoast();
        darkRoast = new SmallCup(darkRoast); // 设置小杯（装饰器）
        printDescAndPrice(darkRoast);

        Beverage decaf = new Decaf();
        decaf = new BigCup(decaf); // 设置大杯（装饰器）
        decaf = new Milk(decaf); // 添加牛奶（装饰器）
        decaf = new Soy(decaf); // 添加豆浆（装饰器）
        decaf = new Whip(decaf); // 添加奶泡（装饰器）
        printDescAndPrice(decaf);

        Beverage espresso = new Espresso();
        espresso = new MiddleCup(espresso); // 设置中杯（装饰器）
        espresso = new Mocha(espresso); // 添加摩卡（装饰器）
        espresso = new Soy(espresso); // 添加豆浆（装饰器）
        printDescAndPrice(espresso);

        Beverage houseBlend = new HouseBlend();
        houseBlend = new MiddleCup(houseBlend); // 设置中杯（装饰器）
        houseBlend = new Milk(houseBlend); // 添加牛奶（装饰器）
        houseBlend = new Soy(houseBlend); // 添加豆浆（装饰器）
        houseBlend = new Mocha(houseBlend); // 添加摩卡（装饰器）
        houseBlend = new Whip(houseBlend);  // 添加奶泡（装饰器）
        printDescAndPrice(houseBlend);

        /*
            运行结果：
            名称：深度烘焙饮料，大杯 | 价格：14.0
            名称：咖啡因饮料，大杯，牛奶，豆浆，奶泡 | 价格：28.0
            名称：浓咖啡饮料，中杯，摩卡，豆浆 | 价格：26.0
            名称：家庭搅拌饮料，中杯，牛奶，豆浆，摩卡，奶泡 | 价格：29.0
         */
    }

    private static void printDescAndPrice(Beverage beverage) {
        System.out.println(String.format("名称：%s | 价格：%s",
                beverage.getDescription(), beverage.cost()));
    }

}
