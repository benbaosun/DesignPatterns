package ApapterPattern.DuckExapmle;

import ApapterPattern.DuckExapmle.duck.Duck;
import ApapterPattern.DuckExapmle.turkey.Turkey;

/**
 * @author lkmc2
 * @date 2018/9/2
 * @description 街头顽禽适配器（实现鸭子接口）
 * 缺少鸭子，需要拿街头顽禽冒充
 */
public class TurkeyAdapter implements Duck {
    private Turkey turkey; // 街头顽禽

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble(); // 咯咯叫
    }

    @Override
    public void fly() {
        // 街头顽禽需要飞行五次才能达到和鸭子的效果
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
