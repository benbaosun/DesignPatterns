package StatePattern.state;

import StatePattern.GumballMachine;

/**
 * @author lkmc2
 * @date 2018/9/3
 * @description 未投币状态（状态模式）
 */
public class NoMoneyState implements State {
    private GumballMachine gumballMachine; // 糖果机

    public NoMoneyState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("已投币");
        // 设置状态为已投币
        gumballMachine.setState(gumballMachine.getHasMoneyState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("未投币，无法退回");
    }

    @Override
    public void turnCrank() {
        System.out.println("已移动曲柄，但未投币，没有糖果");
    }

    @Override
    public void dispense() {
        System.out.println("未投币，请先投币");
    }
}
