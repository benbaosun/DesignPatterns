package IteratorPattern.iterator;

import IteratorPattern.component.MenuComponent;

import java.util.Iterator;

/**
 * @author lkmc2
 * @date 2018/9/3
 * @description 空迭代器
 */
public class NullIterator implements Iterator<MenuComponent> {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public MenuComponent next() {
        return null;
    }
}
