package StatePattern;

/**
 * @author lkmc2
 * @date 2018/9/3
 * @description 糖果机抽奖测试
 */
public class GumballMachineWinnerTest {

    public static void main(String[] args) {
        // 糖果机（共有5颗糖果）
        GumballMachine gumballMachine = new GumballMachine(5);
        printGumballMachineState(gumballMachine); // 打印糖果机状态

        gumballMachine.insertQuarter(); // 投币
        gumballMachine.turnCrank(); // 移动曲柄（移动曲柄才会发放糖果）
        printGumballMachineState(gumballMachine); // 打印糖果机状态

        gumballMachine.insertQuarter(); // 投币
        gumballMachine.turnCrank(); // 移动曲柄（移动曲柄才会发放糖果）
        printGumballMachineState(gumballMachine); // 打印糖果机状态

        gumballMachine.insertQuarter(); // 投币
        gumballMachine.turnCrank(); // 移动曲柄（移动曲柄才会发放糖果）
        printGumballMachineState(gumballMachine); // 打印糖果机状态

        /*
            运行结果：
            糖果机状态[未投币]，剩余糖果数：[5]
            -----------------------------------
            已投币
            已移动曲柄
            已弹出糖果
            糖果机状态[未投币]，剩余糖果数：[4]
            -----------------------------------
            已投币
            已移动曲柄
            恭喜中奖！
            已弹出糖果
            已弹出糖果
            糖果机状态[未投币]，剩余糖果数：[2]
            -----------------------------------
            已投币
            已移动曲柄
            已弹出糖果
            糖果机状态[未投币]，剩余糖果数：[1]
            -----------------------------------
         */
    }

    // 打印糖果机状态
    private static void printGumballMachineState(GumballMachine gumballMachine) {
        System.out.println(gumballMachine); // 打印糖果机状态
        System.out.println("-----------------------------------");
    }

}