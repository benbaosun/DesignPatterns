package ApapterPattern.duck;

/**
 * @author lkmc2
 * @date 2018/9/2
 * @description 绿头鸭
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("呱呱叫");
    }

    @Override
    public void fly() {
        System.out.println("我会飞");
    }
}
