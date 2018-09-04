package ProxyPattern.GumballMachine.server;

import ProxyPattern.GumballMachine.remote.GumballMachine;
import ProxyPattern.GumballMachine.remote.GumballMachineRemote;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

/**
 * @author lkmc2
 * @date 2018/9/4
 * @description 糖果机远程服务器
 */
public class GumballMachineServer {

    public static void main(String[] args) throws RemoteException, MalformedURLException {
        GumballMachineRemote gumballMachine; // 糖果机代理

        // 1.运行前需要cd out/production/DesignPatterns （相当于class目录下）
        // 2.然后执行start rmiregistry （开启注册RMI服务）

        // 分别注册三个代理服务器
        gumballMachine = new GumballMachine(5, "北京王府井");
        // 注册代理服务器
        Naming.rebind("one-gumballmachine", gumballMachine);


        gumballMachine = new GumballMachine(10, "上海东方塔");
        // 注册代理服务器
        Naming.rebind("two-gumballmachine", gumballMachine);


        gumballMachine = new GumballMachine(20, "武汉世界之窗");
        // 注册代理服务器
        Naming.rebind("three-gumballmachine", gumballMachine);
    }

}
