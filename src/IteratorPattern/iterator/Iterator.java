package IteratorPattern.iterator;

/**
 * @author lkmc2
 * @date 2018/9/3
 * @description 迭代器
 */
public interface Iterator {
    // 是否有下一项
    boolean hasNext();
    // 获取下一项的值
    Object next();
}
