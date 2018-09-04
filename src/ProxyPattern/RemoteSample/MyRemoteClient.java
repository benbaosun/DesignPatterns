package ProxyPattern.RemoteSample;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * @author lkmc2
 * @date 2018/9/4
 * @description 客户端
 */
public class MyRemoteClient {

    // 运行远程方法
    private void go() {
        try {
            MyRemote service = (MyRemote) Naming.lookup("rmi://127.0.0.1/RemoteHello");
            String result = service.sayHello();
            System.out.println(result);
        } catch (NotBoundException | MalformedURLException | RemoteException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new MyRemoteClient().go();
    }

}
