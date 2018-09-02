package ApapterPattern.IteratorExample;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * @author lkmc2
 * @date 2018/9/2
 * @description 将Enumeration转换成Iterator的适配器
 */
public class EnumerationAdapter implements Iterator {
    private Enumeration enumeration;

    public EnumerationAdapter(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }
}
