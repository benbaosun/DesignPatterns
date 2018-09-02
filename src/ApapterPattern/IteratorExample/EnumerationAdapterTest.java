package ApapterPattern.IteratorExample;


import java.util.Enumeration;
import java.util.Vector;

/**
 * @author lkmc2
 * @date 2018/9/2
 * @description 迭代类型适配器测试
 */
public class EnumerationAdapterTest {

    public static void main(String[] args) {
        Vector<String> vector = new Vector<String>() {{
            add("Nothing in the world.");
            add("Here is something news.");
            add("Get out of here.");
        }};

        Enumeration<String> elements = vector.elements();
        EnumerationAdapter enumAdapter = new EnumerationAdapter(elements);

        while (enumAdapter.hasNext()) {
            Object item = enumAdapter.next();
            System.out.println(item);
        }

        /*
            运行结果：
            Nothing in the world.
            Here is something news.
            Get out of here.
         */
    }

}