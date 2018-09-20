package BuilderPattern;

/**
 * @author lkmc2
 * @date 2018/9/20
 * @description 测试类
 */
public class TestMain {

    public static void main(String[] args) {
        Person person1 = new Person(1, "Jack");
        Person person2 = new Person(2, "Andy", 22);
        Person person3 = new Person(3, "Wang", 18, "男");
        Person person4 = new Person(4, "Hack", 18, "男", "18755668899");
        Person person5 = new Person(5, "Kim", 18, "女", "18679002635", "玉林");
        Person person6 = new Person(6, "Cindy", 18, "女", "13726594488", "北海", "一个善良的人");

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
        System.out.println(person5);
        System.out.println(person6);

        /*
            运行结果：
            Person{id=1, name='Jack', age=0, sex='null', phone='null', address='null', desc='null'}
            Person{id=2, name='Andy', age=22, sex='null', phone='null', address='null', desc='null'}
            Person{id=3, name='Wang', age=18, sex='男', phone='null', address='null', desc='null'}
            Person{id=4, name='Hack', age=18, sex='男', phone='18755668899', address='null', desc='null'}
            Person{id=5, name='Kim', age=18, sex='女', phone='18679002635', address='玉林', desc='null'}
            Person{id=6, name='Cindy', age=18, sex='女', phone='13726594488', address='北海', desc='一个善良的人'}
         */
    }

}
