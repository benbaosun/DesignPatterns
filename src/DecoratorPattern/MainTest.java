package DecoratorPattern;

import DecoratorPattern.drink.*;
import DecoratorPattern.taste.Milk;
import DecoratorPattern.taste.Mocha;
import DecoratorPattern.taste.Soy;
import DecoratorPattern.taste.Whip;

/**
 * @author lkmc2
 * @date 2018/9/1
 * @description 装饰者模式测试类
 */

public class MainTest {

    public static void main(String[] args) {
        Beverage darkRoast = new DarkRoast();
        printDescAndPrice(darkRoast);

        Beverage decaf = new Decaf();
        decaf = new Milk(decaf); // 添加牛奶（装饰器）
        decaf = new Soy(decaf); // 添加豆浆（装饰器）
        decaf = new Whip(decaf); // 添加奶泡（装饰器）
        printDescAndPrice(decaf);

        Beverage espresso = new Espresso();
        espresso = new Mocha(espresso); // 添加摩卡（装饰器）
        espresso = new Soy(espresso); // 添加豆浆（装饰器）
        printDescAndPrice(espresso);

        Beverage houseBlend = new HouseBlend();
        houseBlend = new Milk(houseBlend); // 添加牛奶（装饰器）
        houseBlend = new Soy(houseBlend); // 添加豆浆（装饰器）
        houseBlend = new Mocha(houseBlend); // 添加摩卡（装饰器）
        houseBlend = new Whip(houseBlend);  // 添加奶泡（装饰器）
        printDescAndPrice(houseBlend);

        /*
            运行结果：
            名称：深度烘焙饮料 | 价格：11.0
            名称：咖啡因饮料，牛奶，豆浆，奶泡 | 价格：25.0
            名称：浓咖啡饮料，摩卡，豆浆 | 价格：24.0
            名称：家庭搅拌饮料，牛奶，豆浆，摩卡，奶泡 | 价格：27.0
         */
    }

    private static void printDescAndPrice(Beverage beverage) {
        System.out.println(String.format("名称：%s | 价格：%s",
                beverage.getDescription(), beverage.cost()));
    }

}
