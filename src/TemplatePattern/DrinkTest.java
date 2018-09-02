package TemplatePattern;

/**
 * @author lkmc2
 * @date 2018/9/2
 * @description 饮料测试
 */
public class DrinkTest {

    public static void main(String[] args) {
        CoffeeWithHook coffee = new CoffeeWithHook();
        coffee.prepareRecipe(); // 准备咖啡

        System.out.println("----------------");

        TeaWithHook tea = new TeaWithHook();
        tea.prepareRecipe(); // 准备茶

        /*
            运行结果：
            煮沸水
            冲泡咖啡
            把饮料倒进杯子
            请问要在咖啡里添加牛奶或糖么？[输入y或n]
            n
            ----------------
            煮沸水
            冲泡茶包
            把饮料倒进杯子
            请问要在咖啡里添加柠檬么？[输入y或n]
            y
            加柠檬
         */
    }

}
