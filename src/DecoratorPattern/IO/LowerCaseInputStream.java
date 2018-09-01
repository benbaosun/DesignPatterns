package DecoratorPattern.IO;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author lkmc2
 * @date 2018/9/1
 * @description 转换小写输入流（装饰器）
 */
public class LowerCaseInputStream extends FilterInputStream {

    protected LowerCaseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int ch = super.read();
        return (ch == -1 ? ch : Character.toLowerCase((char)ch));
    }

    @Override
    public int read(byte[] b, int offset, int len) throws IOException {
        int result = super.read(b, offset, len);

        for (int i = offset; i < offset + result; i++) {
            b[i] = (byte) Character.toLowerCase((char) b[i]);
        }

        return result;
    }
}
