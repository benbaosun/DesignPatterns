package DecoratorPattern.IO;

import java.io.*;
import java.util.Objects;

/**
 * @author lkmc2
 * @date 2018/9/1
 * @description 转换小写输入流测试类
 */
public class InputTest {

    public static void main(String[] args) {
        int ch;

        InputStream in = null;
        try {
            in =
               new LowerCaseInputStream(
                    new BufferedInputStream(
                        new FileInputStream("src/DecoratorPattern/IO/info.txt")));

            while ((ch = in.read()) >= 0) {
                System.out.print((char)ch);
            }
            /*
                运行结果：
                everything is nothing
             */
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                Objects.requireNonNull(in).close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
