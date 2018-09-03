package ProxyPattern;

import java.util.Scanner;

/**
 * @author lkmc2
 * @date 2018/9/3
 * @description 糖果机监视器测试类
 */
public class GumballMonitorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入糖果数目：");
        int count = scanner.nextInt();

        // 糖果机
        GumballMachine machine = new GumballMachine(count, "北京王府井");
        // 糖果机监视器
        GumballMonitor monitor = new GumballMonitor(machine);

        // 打印糖果机报告
        monitor.report();

        /*
            运行状态：
            请输入糖果数目：
            9
            ------ 糖果机报告------
            糖果机位置：北京王府井
            剩余糖果数：9
            当前状态：糖果机状态[未投币]
         */

    }

}