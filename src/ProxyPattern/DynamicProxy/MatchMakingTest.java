package ProxyPattern.DynamicProxy;

import ProxyPattern.DynamicProxy.bean.PersonBean;
import ProxyPattern.DynamicProxy.bean.PersonBeanImpl;
import ProxyPattern.DynamicProxy.handler.NonOwnerInvocationHandler;
import ProxyPattern.DynamicProxy.handler.OwnerInvocationHandler;

import java.lang.reflect.Proxy;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author lkmc2
 * @date 2018/9/4
 * @description 人物配对测试
 */
public class MatchMakingTest {
    private Map<String, PersonBean> dataMap; // 数据库

    private MatchMakingTest() {
        initDatabase(); // 初始化数据库数据
    }

    // 初始化数据库数据
    private void initDatabase() {
        dataMap = new LinkedHashMap<>();

        // 设置数据到数据库
        PersonBean jack = new PersonBeanImpl();
        jack.setName("Jack");
        jack.setGender("男");
        jack.setInterests("羽毛球");
        jack.setHotOrNotRating(17);

        PersonBean andy = new PersonBeanImpl();
        andy.setName("Andy");
        andy.setGender("女");
        andy.setInterests("高尔夫");
        andy.setHotOrNotRating(45);

        dataMap.put("Jack", jack);
        dataMap.put("Andy", andy);
    }

    // 开始匹配
    private void drive() {
        PersonBean jack = getPersonFromDatabase("Jack"); // 从数据库中获取信息
        PersonBean ownerProxy = getOwnerProxy(jack); // 获取人物代理（有修改权限）
        System.out.println("当前人物的名字为：" + ownerProxy.getName());

        ownerProxy.setInterests("摇滚"); // 设置兴趣
        try {
            ownerProxy.setHotOrNotRating(10); // 增加热度值
        } catch (Exception e) {
            System.out.println("用户本人无法设置热度值");
        }
        System.out.println("当前的热度值为：" + ownerProxy.getHorOrNotRating());
        System.out.println("-----------------------------------------");

        PersonBean nonOwnerProxy = getNonOwnerProxy(jack); // 获取人物代理（无修改权限）
        System.out.println("当前人物的名字为：" + nonOwnerProxy.getName());

        try {
            nonOwnerProxy.setInterests("滑雪");
        } catch (Exception e) {
            System.out.println("非用户本人无法设置用户属性");
        }
        nonOwnerProxy.setHotOrNotRating(3); // 添加热度值
        System.out.println("当前的热度值为：" + nonOwnerProxy.getHorOrNotRating());

        /*
            运行结果：
            当前人物的名字为：Jack
            用户本人无法设置热度值
            当前的热度值为：17
            -----------------------------------------
            当前人物的名字为：Jack
            非用户本人无法设置用户属性
            当前的热度值为：10
         */
    }

    // 获取人物代理（有权限操作）
    private PersonBean getOwnerProxy(PersonBean person) {
        Class<?> clazz = person.getClass();
        return (PersonBean) Proxy.newProxyInstance(clazz.getClassLoader(),
                                                    clazz.getInterfaces(),
                                                    new OwnerInvocationHandler(person));
    }

    // 获取人物代理（无权限操作）
    private PersonBean getNonOwnerProxy(PersonBean person) {
        Class<?> clazz = person.getClass();
        return (PersonBean) Proxy.newProxyInstance(clazz.getClassLoader(),
                clazz.getInterfaces(),
                new NonOwnerInvocationHandler(person));
    }


    private PersonBean getPersonFromDatabase(String name) {
        return dataMap.get(name);
    }

    public static void main(String[] args) {
        MatchMakingTest makingTest = new MatchMakingTest();
        makingTest.drive();
    }

}
