package ProxyPattern.DynamicProxy.handler;

import ProxyPattern.DynamicProxy.bean.PersonBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author lkmc2
 * @date 2018/9/4
 * @description 无权修改限控制器（代理模式）
 */
public class NonOwnerInvocationHandler implements InvocationHandler {
    private PersonBean person; // 人物

    public NonOwnerInvocationHandler(PersonBean person) {
        this.person = person;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String methodName = method.getName();

        if (methodName.startsWith("get")) {
            return method.invoke(person, args);
        } else if (methodName.equals("setHotOrNotRating")) {
            return method.invoke(person, args);
        } else if (methodName.startsWith("set")) {
            throw new IllegalAccessException();
        }
        return null;
    }
}
