package ProxyPattern.GumballMachine.client;

import ProxyPattern.GumballMachine.remote.GumballMachineRemote;

import java.rmi.RemoteException;

/**
 * @author lkmc2
 * @date 2018/9/3
 * @description 糖果机监视器（代理类）
 */
public class GumballMonitor {
    private GumballMachineRemote machine; // 糖果机代理

    public GumballMonitor(GumballMachineRemote machine) {
        this.machine = machine;
    }

    // 打印糖果机报告
    public void report() {
        try {
            printReport(); // 打印报告信息
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    // 打印报告信息
    private void printReport() throws RemoteException {
        System.out.println("------ 糖果机报告------");
        System.out.println("糖果机位置：" + machine.getLocation());
        System.out.println("剩余糖果数：" + machine.getCount());
        System.out.println("当前状态：" + machine.getState());
    }
}
