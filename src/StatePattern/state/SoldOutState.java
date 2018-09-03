package StatePattern.state;

import StatePattern.GumballMachine;

/**
 * @author lkmc2
 * @date 2018/9/3
 * @description 售空状态（状态模式）
 */
public class SoldOutState implements State {
    private GumballMachine gumballMachine; // 糖果机

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("已售空，不能投币");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("已售空，无法退币");
    }

    @Override
    public void turnCrank() {
        System.out.println("已移动曲柄，但已售空，没有可用糖果");
    }

    @Override
    public void dispense() {
        System.out.println("已售空");
    }
}
