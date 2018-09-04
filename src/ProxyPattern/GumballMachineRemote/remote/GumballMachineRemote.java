package ProxyPattern.GumballMachineRemote.remote;



import ProxyPattern.GumballMachineRemote.state.State;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author lkmc2
 * @date 2018/9/4
 * @description 糖果机代理（远程代理）
 */
public interface GumballMachineRemote extends Remote {
    // 获取剩余糖果数目
    int getCount() throws RemoteException;
    // 获取糖果机位置
    String getLocation() throws RemoteException;
    // 获取糖果机状态
    State getState() throws RemoteException;
}
