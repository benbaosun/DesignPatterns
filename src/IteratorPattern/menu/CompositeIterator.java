package IteratorPattern.menu;

import IteratorPattern.component.MenuComponent;

import java.util.Iterator;
import java.util.Stack;

/**
 * @author lkmc2
 * @date 2018/9/3
 * @description 组合迭代器
 */
public class CompositeIterator implements Iterator<MenuComponent> {
    private Stack<Iterator<MenuComponent>> stack; // 子菜单项栈

    public CompositeIterator(Iterator<MenuComponent> iterator) {
        stack = new Stack<>();

        // 将迭代器放入栈中
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if (stack.isEmpty()) {
            return false;
        }

        // 取出栈顶元素，但不删除
        Iterator iterator = stack.peek();

        // 栈顶的迭代器没有元素
        if (!iterator.hasNext()) {
            stack.pop(); // 弹出栈顶元素
            return hasNext(); // 递归查询是否还有元素
        }

        return true;
    }

    @Override
    public MenuComponent next() {
        if (hasNext()) {
            // 取出栈顶的迭代器，但不删除
            Iterator<MenuComponent> iterator = stack.peek();
            // 获取迭代器的第一个元素
            MenuComponent component = iterator.next();

            // 是Menu的实例
            if (component instanceof Menu) {
                // 将Menu生成迭代器之后添加到栈中
                stack.push(component.createIterator());
            }
            return component;
        }

        return null;
    }
}
