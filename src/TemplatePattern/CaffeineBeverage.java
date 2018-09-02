package TemplatePattern;

/**
 * @author lkmc2
 * @date 2018/9/2
 * @description 咖啡因饮料（模板类）
 */
public abstract class CaffeineBeverage {

    // 准备食谱
    protected void prepareRecipe() {
        boilWater(); // 煮沸水
        brew(); // 冲泡
        pourInCup(); // 把咖啡倒进杯子
        addCondiments(); // 添加调味料
    }

    // 冲泡
    protected abstract void brew();

    // 添加调味料
    protected abstract void addCondiments();

    private void boilWater() {
        System.out.println("煮沸水");
    }

    private void pourInCup() {
        System.out.println("把饮料倒进杯子");
    }

}
