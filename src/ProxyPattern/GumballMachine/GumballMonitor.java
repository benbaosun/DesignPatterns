package ProxyPattern.GumballMachine;

/**
 * @author lkmc2
 * @date 2018/9/3
 * @description 糖果机监视器（代理类）
 */
public class GumballMonitor {
    private GumballMachine machine; // 糖果机

    public GumballMonitor(GumballMachine machine) {
        this.machine = machine;
    }

    // 打印糖果机报告
    public void report() {
        System.out.println("------ 糖果机报告------");
        System.out.println("糖果机位置：" + machine.getLocation());
        System.out.println("剩余糖果数：" + machine.getCount());
        System.out.println("当前状态：" + machine.getState());
    }
}
