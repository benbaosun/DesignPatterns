package DecoratorPattern;

/**
 * @author lkmc2
 * @date 2018/9/1
 * @description 装饰者模式测试类
 */

public class MainTest {

    public static void main(String[] args) {
        DarkRoast darkRoast = new DarkRoast();
        printDescAndPrice(darkRoast);

        Decaf decaf = new Decaf();
        printDescAndPrice(decaf);

        Espresso espresso = new Espresso();
        printDescAndPrice(espresso);

        HouseBlend houseBlend = new HouseBlend();
        printDescAndPrice(houseBlend);

        /*
            运行结果：
            名称：深度烘焙饮料，价格：26.0
            名称：咖啡因饮料，价格：15.0
            名称：浓咖啡饮料，价格：23.0
            名称：家庭搅拌饮料，价格：18.0
         */
    }

    private static void printDescAndPrice(Beverage beverage) {
        System.out.println(String.format("名称：%s，价格：%s",
                beverage.getDescription(), beverage.cost()));
    }

}
