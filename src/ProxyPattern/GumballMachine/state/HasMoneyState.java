package ProxyPattern.GumballMachine.state;

import ProxyPattern.GumballMachine.GumballMachine;
import ProxyPattern.GumballMachine.state.State;

import java.util.Random;

/**
 * @author lkmc2
 * @date 2018/9/3
 * @description 已投币状态（状态模式）
 */
public class HasMoneyState implements State {
    private Random randomWinner = new Random(System.currentTimeMillis()); // 决定中奖的随机数
    private GumballMachine gumballMachine; // 糖果机

    public HasMoneyState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("已投币，不能再投入新的硬币");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("硬币已退回");
        // 设置状态为未投币
        gumballMachine.setState(gumballMachine.getNoMoneyState());
    }

    @Override
    public void turnCrank() {
        System.out.println("已移动曲柄");

        // 根据获取的随机数决定中奖
        int winner = randomWinner.nextInt(10);

        // 中奖（糖果机中的糖果数大于1）
        if ((winner == 0) && gumballMachine.getCount() > 1) {
            // 设置状态为中奖
            gumballMachine.setState(gumballMachine.getWinnerState());
        } else { // 未中奖
            // 设置状态为售出
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }

    @Override
    public void dispense() {
        System.out.println("已售空（系统故障）");
    }
}
