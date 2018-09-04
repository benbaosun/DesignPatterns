package ProxyPattern.RemoteSample;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author lkmc2
 * @date 2018/9/4
 * @description 自定义远程服务器
 */
public interface MyRemote extends Remote {
    String sayHello() throws RemoteException;
}
