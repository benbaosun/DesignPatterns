package BuilderPattern;

/**
 * @author lkmc2
 * @date 2018/9/20
 * @description 测试类
 */
public class TestMain {

    public static void main(String[] args) {

        // 使用Builder模式构建对象
        Person person = new Person.Builder()
                .id(1)
                .age(18)
                .sex("男")
                .phone("13845671289")
                .address("北海")
                .desc("一个善良的人")
                .build();

        System.out.println(person);

        /*
            运行结果：
            Person{id=1, name='null', age=18, sex='男', phone='13845671289', address='北海', desc='一个善良的人'}
         */
    }

}
