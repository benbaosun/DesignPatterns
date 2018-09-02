package TemplatePattern;

/**
 * @author lkmc2
 * @date 2018/9/2
 * @description 茶
 */
public class Tea extends CaffeineBeverage {

    @Override
    protected void brew() {
        System.out.println("冲泡茶包");
    }

    @Override
    protected void addCondiments() {
        System.out.println("加柠檬");
    }

}
