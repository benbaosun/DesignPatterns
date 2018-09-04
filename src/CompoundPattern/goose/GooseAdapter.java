package CompoundPattern.goose;

import CompoundPattern.duck.Quackable;

/**
 * @author lkmc2
 * @date 2018/9/4
 * @description
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
