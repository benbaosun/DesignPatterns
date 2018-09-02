package TemplatePattern;

/**
 * @author lkmc2
 * @date 2018/9/2
 * @description 咖啡
 */
public class Coffee extends CaffeineBeverage {

    @Override
    protected void brew() {
        System.out.println("冲泡咖啡");
    }

    @Override
    protected void addCondiments() {
        System.out.println("加糖加奶");
    }

}
