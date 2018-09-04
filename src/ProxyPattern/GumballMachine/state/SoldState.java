package ProxyPattern.GumballMachine.state;

import ProxyPattern.GumballMachine.GumballMachine;
import ProxyPattern.GumballMachine.state.State;

/**
 * @author lkmc2
 * @date 2018/9/3
 * @description 已售出状态（状态模式）
 */
public class SoldState implements State {
    private GumballMachine gumballMachine; // 糖果机

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("请等待，正在准备糖果");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("已拿到糖果，无法退币");
    }

    @Override
    public void turnCrank() {
        System.out.println("已移动两次曲柄，没有另一个糖果");
    }

    @Override
    public void dispense() {
        // 弹出一颗糖果
        gumballMachine.releaseBall();

        // 糖果机有糖果
        if (gumballMachine.getCount() > 0) {
            // 设置状态为未投币
            gumballMachine.setState(gumballMachine.getNoMoneyState());
        } else {
            System.out.println("糖果机售空");

            // 设置状态为已售空
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}
