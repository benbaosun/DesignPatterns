package ProxyPattern.DynamicProxy.handler;

import ProxyPattern.DynamicProxy.bean.PersonBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author lkmc2
 * @date 2018/9/4
 * @description 有修改权限控制器（代理模式）
 */
public class OwnerInvocationHandler implements InvocationHandler {
    private PersonBean person; // 人物

    public OwnerInvocationHandler(PersonBean person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String methodName = method.getName();

        if (methodName.startsWith("get")) {
            return method.invoke(person, args);
        } else if (methodName.equals("setHotOrNotRating")) {
            throw new IllegalAccessException();
        } else if (methodName.startsWith("set")) {
            return method.invoke(person, args);
        }
        return null;
    }
}
