package StatePattern;

import StatePattern.state.*;

/**
 * @author lkmc2
 * @date 2018/9/3
 * @description 糖果机
 */
public class GumballMachine {
    private State soldOutState; // 未投币
    private State noMoneyState; // 投币
    private State hasMoneyState; // 卖光
    private State soldState; // 售出糖果
    private State winnerState; // 中奖

    private State state = null; // 糖果机状态
    private int count; // 现有糖果数目

    public GumballMachine(int count) {
        soldOutState = new SoldOutState(this);
        noMoneyState = new NoMoneyState(this);
        hasMoneyState = new HasMoneyState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);

        this.count = count;

        // 糖果数目大于0
        if (count > 0) {
            state = noMoneyState; // 设置状态为未投币
        }
    }

    // 投币
    public void insertQuarter() {
        state.insertQuarter();
    }

    // 退币
    public void ejectQuarter() {
        state.ejectQuarter();
    }

    // 移动曲柄（移动曲柄才会发放糖果）
    public void turnCrank() {
        state.turnCrank();
        state.dispense(); // 发放糖果
    }

    // 弹出一颗糖果
    public void releaseBall() {
        // 糖果数目大于0
        if (count > 0) {
            System.out.println("已弹出糖果");
            count = count - 1; // 设置状态为未投币
        }
    }

    @Override
    public String toString() {
        String stateStr;
        if (state instanceof SoldOutState) {
            stateStr = "已售空";
        } else if (state instanceof HasMoneyState) {
            stateStr = "已投币";
        } else if (state instanceof SoldState) {
            stateStr = "已售出";
        } else  {
            stateStr = "未投币";
        }
        return String.format("糖果机状态[%s]，剩余糖果数：[%s]", stateStr, count);
    }

    // 获取糖果数目
    public int getCount() {
        return count;
    }

    // 设置糖果机状态
    public void setState(State state) {
        this.state = state;
    }

    public State getHasMoneyState() {
        return hasMoneyState;
    }

    public State getNoMoneyState() {
        return noMoneyState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }
}
