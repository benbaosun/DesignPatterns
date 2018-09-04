package ProxyPattern.remote;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author lkmc2
 * @date 2018/9/4
 * @description 自定义远程服务器实现类
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

    private MyRemoteImpl() throws RemoteException {
    }

    @Override
    public String sayHello() throws RemoteException {
        return "服务器向你打招呼";
    }

    public static void main(String[] args) {
        try {
            // 1.运行前需要cd out/production/DesignPatterns （相当于class目录下）
            // 2.然后执行start rmiregistry （开启注册RMI服务）
            MyRemoteImpl service = new MyRemoteImpl();
            Naming.rebind("RemoteHello", service);
        } catch (RemoteException | MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
