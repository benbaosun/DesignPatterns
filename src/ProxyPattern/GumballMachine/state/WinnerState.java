package ProxyPattern.GumballMachine.state;

import ProxyPattern.GumballMachine.remote.GumballMachine;

/**
 * @author lkmc2
 * @date 2018/9/3
 * @description 中奖状态
 */
public class WinnerState implements State {
    private transient GumballMachine gumballMachine; // 糖果机（不序列化此属性）

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("抽奖出现错误");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("抽奖出现错误");
    }

    @Override
    public void turnCrank() {
        System.out.println("抽奖出现错误");
    }

    @Override
    public void dispense() {
        System.out.println("恭喜中奖！");

        // 弹出一颗糖果
        gumballMachine.releaseBall();

        // 糖果数为0，设置状态为售空
        if (gumballMachine.getCount() == 0) {
            gumballMachine.setState(gumballMachine.getSoldState());
        } else {
            // 弹出一颗糖果（奖励的糖果）
            gumballMachine.releaseBall();

            // 还有糖果
            if (gumballMachine.getCount() > 0) {
                // 设置状态为未投币
                gumballMachine.setState(gumballMachine.getNoMoneyState());
            } else { // 没有糖果
                System.out.println("糖果机售空");
                // 设置状态为售空
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }
}
