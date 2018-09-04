package ProxyPattern.GumballMachine.state;

/**
 * @author lkmc2
 * @date 2018/9/3
 * @description 状态
 */
public interface State {
    // 投币
    void insertQuarter();
    // 退币
    void ejectQuarter();
    // 移动曲柄（移动曲柄才会发放糖果）
    void turnCrank();
    // 发放糖果
    void dispense();
}
