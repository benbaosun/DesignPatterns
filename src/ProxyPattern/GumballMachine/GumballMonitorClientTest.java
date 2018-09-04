package ProxyPattern.GumballMachine;

import ProxyPattern.GumballMachine.client.GumballMonitor;
import ProxyPattern.GumballMachine.remote.GumballMachineRemote;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * @author lkmc2
 * @date 2018/9/4
 * @description 糖果机监视器客户端测试
 */
public class GumballMonitorClientTest {

    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {
        // 监控的服务器地址
        String[] locations = {
            "rmi://127.0.0.1/one-gumballmachine",
            "rmi://127.0.0.1/two-gumballmachine",
            "rmi://127.0.0.1/three-gumballmachine"
        };

        // 糖果机监视器数组
        GumballMonitor[] monitors = new GumballMonitor[locations.length];

        for (int i = 0; i < locations.length; i++) {
            // 通过服务器地址获取糖果机代理
            GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup(locations[i]);
            monitors[i] = new GumballMonitor(machine);
        }

        // 遍历所有糖果机代理
        for (GumballMonitor monitor : monitors) {
            monitor.report(); // 打印对应的糖果机状态
        }

        /*
            运行结果：
            ------ 糖果机报告------
            糖果机位置：北京王府井
            剩余糖果数：5
            当前状态：ProxyPattern.GumballMachine.state.NoMoneyState@246b179d
            ------ 糖果机报告------
            糖果机位置：上海东方塔
            剩余糖果数：10
            当前状态：ProxyPattern.GumballMachine.state.NoMoneyState@7a07c5b4
            ------ 糖果机报告------
            糖果机位置：武汉世界之窗
            剩余糖果数：20
            当前状态：ProxyPattern.GumballMachine.state.NoMoneyState@26a1ab54
         */
    }

}
