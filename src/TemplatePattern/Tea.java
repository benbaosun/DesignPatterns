package TemplatePattern;

/**
 * @author lkmc2
 * @date 2018/9/2
 * @description 茶
 */
public class Tea {

    // 准备食谱
    public void prepareRecipe() {
        boilWater(); // 煮沸水
        steepTeaBag(); // 冲泡茶包
        pourInCup(); // 把茶倒进杯子
        addLemon(); // 加柠檬
    }
    
    private void boilWater() {
        System.out.println("煮沸水");
    }
    
    private void steepTeaBag() {
        System.out.println("冲泡茶包");
    }

    private void pourInCup() {
        System.out.println("把茶倒进杯子");
    }

    private void addLemon() {
        System.out.println("加柠檬");
    }

}
