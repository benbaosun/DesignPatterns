package IteratorAndCompositePattern.component;

import java.util.Iterator;

/**
 * @author lkmc2
 * @date 2018/9/3
 * @description 菜单组件（组合模式）
 */
public abstract class MenuComponent {

    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int index) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        throw new UnsupportedOperationException();
    }

    public String getDescription() {
        throw new UnsupportedOperationException();
    }

    public double getPrice() {
        throw new UnsupportedOperationException();
    }

    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }

    public void print() {
        throw new UnsupportedOperationException();
    }

    // 创建迭代器
    public Iterator<MenuComponent> createIterator() {
        throw new UnsupportedOperationException();
    }

}
