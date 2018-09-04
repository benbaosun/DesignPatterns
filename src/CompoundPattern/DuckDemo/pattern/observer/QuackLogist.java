package CompoundPattern.DuckDemo.pattern.observer;

/**
 * @author lkmc2
 * @date 2018/9/4
 * @description 叫唤学家
 */
public class QuackLogist implements Observer {
    @Override
    public void update(QuackObservable duck) {
        System.out.printf("叫唤学家：记录到鸭子%s在叫唤\n", duck);
    }
}
