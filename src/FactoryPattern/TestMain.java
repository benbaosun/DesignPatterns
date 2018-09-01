package FactoryPattern;

/**
 * @author lkmc2
 * @date 2018/9/1
 * @description 工厂模式测试类
 */
public class TestMain {

    public static void main(String[] args) {
        // 只有一种披萨时的情况
        PizzaStore pizzaStore = new PizzaStore();
        // 预定披萨
        Pizza pizza = pizzaStore.orderPizza();

        System.out.println(pizza.getName() + "已送达");

        /*
            运行结果：
            开始准备...
            正在烘焙...
            正在裁切...
            正在装箱...
            经典披萨已送达
         */
    }

}
