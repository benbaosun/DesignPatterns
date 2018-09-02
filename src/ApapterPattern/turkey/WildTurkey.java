package ApapterPattern.turkey;

/**
 * @author lkmc2
 * @date 2018/9/2
 * @description 火鸡
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("咯咯叫");
    }

    @Override
    public void fly() {
        System.out.println("我会飞");
    }
}
