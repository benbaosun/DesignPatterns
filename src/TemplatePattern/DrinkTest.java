package TemplatePattern;

/**
 * @author lkmc2
 * @date 2018/9/2
 * @description 饮料测试
 */
public class DrinkTest {

    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        coffee.prepareRecipe(); // 准备咖啡

        System.out.println("----------------");

        Tea tea = new Tea();
        tea.prepareRecipe(); // 准备茶

        /*
            运行结果：
            煮沸水
            冲泡咖啡
            把饮料倒进杯子
            加糖加奶
            ----------------
            煮沸水
            冲泡茶包
            把饮料倒进杯子
            加柠檬
         */
    }

}
