package ProxyPattern;

/**
 * @author lkmc2
 * @date 2018/9/3
 * @description 糖果机监视器测试类
 */
public class GumballMonitorTest {

    public static void main(String[] args) {
        // 糖果机
        GumballMachine machine = new GumballMachine(5, "北京王府井");
        // 糖果机监视器
        GumballMonitor monitor = new GumballMonitor(machine);
        monitor.report(); // 监视器打印糖果机报告

        decreaseOneCandy(machine); // 减去一颗糖果
        monitor.report();  // 监视器打印糖果机报告

        decreaseOneCandy(machine); // 减去一颗糖果
        monitor.report();  // 监视器打印糖果机报告

        /*
            运行状态：
            ------ 糖果机报告------
            糖果机位置：北京王府井
            剩余糖果数：5
            当前状态：糖果机状态[未投币]
            ******************
            已投币
            已移动曲柄
            已弹出糖果
            ******************
            ------ 糖果机报告------
            糖果机位置：北京王府井
            剩余糖果数：4
            当前状态：糖果机状态[未投币]
            ******************
            已投币
            已移动曲柄
            已弹出糖果
            ******************
            ------ 糖果机报告------
            糖果机位置：北京王府井
            剩余糖果数：3
            当前状态：糖果机状态[未投币]
         */

    }

    // 减去一颗糖果
    private static void decreaseOneCandy(GumballMachine machine) {
        System.out.println("******************");
        machine.insertQuarter(); // 投币
        machine.turnCrank(); // 移动曲柄（移动曲柄才会发放糖果）
        System.out.println("******************");
    }

}