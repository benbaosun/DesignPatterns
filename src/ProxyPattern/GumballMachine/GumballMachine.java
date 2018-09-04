package ProxyPattern.GumballMachine;

/**
 * @author lkmc2
 * @date 2018/9/3
 * @description 糖果机
 */
public class GumballMachine {
    private static final int NO_MONEY = 0; // 未投币
    private static final int HAS_MONEY = 1; // 投币
    private static final int SOLD_OUT = 2; // 卖光
    private static final int SOLD = 3; // 售出糖果

    private int state = SOLD_OUT; // 初始状态为卖光
    private int count; // 现有糖果数目
    private String location; // 位置

    public GumballMachine(int count, String location) {
        this.count = count;
        this.location = location;

        // 糖果数目大于0
        if (count > 0) {
            state = NO_MONEY; // 设置状态为未投币
        }
    }

    // 投币
    public void insertQuarter() {
        if (state == HAS_MONEY) { // 之前已投币
            System.out.println("已投币，不能再投入新的硬币");
        } else if (state == NO_MONEY) { // 之前未投币
            state = HAS_MONEY; // 设置状态为已投币
            System.out.println("已投币");
        } else if (state == SOLD_OUT) {
            System.out.println("已售空，不能投币");
        } else if (state == SOLD) {
            System.out.println("请等待，正在准备糖果");
        }
    }

    // 退币
    public void ejectQuarter() {
        if (state == HAS_MONEY) { // 之前已投币
            System.out.println("硬币已退回");
            state = NO_MONEY; // 设置状态为未投币
        } else if (state == NO_MONEY) { // 之前未投币
            System.out.println("未投币，无法退回");
        } else if (state == SOLD_OUT) {
            System.out.println("已售空，无法退币");
        } else if (state == SOLD) {
            System.out.println("已拿到糖果，无法退币");
        }
    }

    // 移动曲柄（移动曲柄才会发放糖果）
    public void turnCrank() {
        if (state == HAS_MONEY) { // 之前已投币
            System.out.println("已移动曲柄");
            state = SOLD; // 设置状态为售出
            dispense(); // 发放糖果
        } else if (state == NO_MONEY) { // 之前未投币
            System.out.println("已移动曲柄，但未投币，没有糖果");
        } else if (state == SOLD_OUT) {
            System.out.println("已移动曲柄，但已售空，没有可用糖果");
        } else if (state == SOLD) {
            System.out.println("已移动两次曲柄，没有另一个糖果");
        }
    }

    // 发放糖果
    public void dispense() {
        if (state == HAS_MONEY) { // 之前已投币
            System.out.println("已售空（系统故障）");
            state = SOLD; // 设置状态为售出
        } else if (state == NO_MONEY) { // 之前未投币
            System.out.println("未投币，请先投币");
        } else if (state == SOLD_OUT) {
            System.out.println("已售空");
        } else if (state == SOLD) {
            System.out.println("已弹出糖果");
            count -= 1; // 糖果数减1

            if (count == 0) {
                System.out.println("已售空，没有新的糖果了");
                state = SOLD_OUT; // 设置状态为已售空
            } else {
                state = NO_MONEY; // 设置状态为未投币
            }
        }
    }

    public String getLocation() {
        return location;
    }

    public int getCount() {
        return count;
    }

    public String getState() {
        String stateStr;
        switch (state) {
            case NO_MONEY:
                stateStr = "未投币";
                break;
            case HAS_MONEY:
                stateStr = "已投币";
                break;
            case SOLD:
                stateStr = "已售出";
                break;
            case SOLD_OUT:
                stateStr = "已售空";
                break;
            default:
                stateStr = "未投币";
        }
        return String.format("糖果机状态[%s]", stateStr);
    }
}
