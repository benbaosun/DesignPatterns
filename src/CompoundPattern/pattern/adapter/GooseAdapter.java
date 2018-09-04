package CompoundPattern.pattern.adapter;

import CompoundPattern.duck.Quackable;
import CompoundPattern.goose.Goose;

/**
 * @author lkmc2
 * @date 2018/9/4
 * @description 鹅适配器（适配器模式）
 */
public class GooseAdapter implements Quackable {
    private Goose goose; // 鹅

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk(); // 叫唤
    }
}
