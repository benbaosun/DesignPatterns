package BuilderPattern;

/**
 * @author lkmc2
 * @date 2018/9/20
 * @description 测试类
 */
public class TestMain {

    public static void main(String[] args) {
        Person person = new Person();
        person.setId(1);
        person.setName("Jack");
        person.setAge(18);
        person.setSex("男");
        person.setPhone("18745694458");
        person.setAddress("北海");
        person.setDesc("一个善良的人");

        System.out.println(person);

        /*
            运行结果：
            Person{id=1, name='Jack', age=0, sex='null', phone='null', address='null', desc='null'}
         */
    }

}
