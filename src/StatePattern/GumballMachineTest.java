package StatePattern;


/**
 * @author lkmc2
 * @date 2018/9/3
 * @description 糖果机测试
 */
public class GumballMachineTest {

    public static void main(String[] args) {
        // 创建带5颗糖的糖果机
        GumballMachine gumballMachine = new GumballMachine(5);
        printGumballMachineState(gumballMachine); // 打印糖果机状态

        gumballMachine.insertQuarter(); // 投币
        gumballMachine.turnCrank(); // 移动曲柄（移动曲柄才会发放糖果）
        printGumballMachineState(gumballMachine); // 打印糖果机状态

        gumballMachine.insertQuarter(); // 投币
        gumballMachine.ejectQuarter(); // 退币
        gumballMachine.turnCrank(); // 移动曲柄（移动曲柄才会发放糖果）
        printGumballMachineState(gumballMachine); // 打印糖果机状态

        gumballMachine.insertQuarter(); // 投币
        gumballMachine.turnCrank(); // 移动曲柄（移动曲柄才会发放糖果）
        gumballMachine.insertQuarter(); // 投币
        gumballMachine.turnCrank(); // 移动曲柄（移动曲柄才会发放糖果）
        gumballMachine.ejectQuarter(); // 退币
        printGumballMachineState(gumballMachine); // 打印糖果机状态

        gumballMachine.insertQuarter(); // 投币
        gumballMachine.insertQuarter(); // 投币
        gumballMachine.turnCrank(); // 移动曲柄（移动曲柄才会发放糖果）
        gumballMachine.insertQuarter(); // 投币
        gumballMachine.turnCrank(); // 移动曲柄（移动曲柄才会发放糖果）
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
            硬币已退回
            已移动曲柄，但未投币，没有糖果
            糖果机状态[未投币]，剩余糖果数：[4]
            -----------------------------------
            已投币
            已移动曲柄
            已弹出糖果
            已投币
            已移动曲柄
            已弹出糖果
            未投币，无法退回
            糖果机状态[未投币]，剩余糖果数：[2]
            -----------------------------------
            已投币
            已投币，不能再投入新的硬币
            已移动曲柄
            已弹出糖果
            已投币
            已移动曲柄
            已弹出糖果
            已售空，没有新的糖果了
            已售空，不能投币
            已移动曲柄，但已售空，没有可用糖果
            糖果机状态[已售空]，剩余糖果数：[0]
            -----------------------------------
         */
    }

    // 打印糖果机状态
    private static void printGumballMachineState(GumballMachine gumballMachine) {
        System.out.println(gumballMachine); // 打印糖果机状态
        System.out.println("-----------------------------------");
    }

}