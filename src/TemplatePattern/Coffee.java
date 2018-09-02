package TemplatePattern;

/**
 * @author lkmc2
 * @date 2018/9/2
 * @description 咖啡
 */
public class Coffee {

    // 准备食谱
    public void prepareRecipe() {
        boilWater(); // 煮沸水
        brewCoffeeGrinds(); // 冲泡咖啡
        pourInCup(); // 把咖啡倒进杯子
        addSugarAndMilk(); // 加糖加奶
    }

    private void boilWater() {
        System.out.println("煮沸水");
    }

    private void brewCoffeeGrinds() {
        System.out.println("冲泡咖啡");
    }

    private void pourInCup() {
        System.out.println("把咖啡倒进杯子");
    }

    private void addSugarAndMilk() {
        System.out.println("加糖加奶");
    }

}
