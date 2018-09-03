package IteratorPattern.iterator;

import IteratorPattern.menu.MenuItem;

import java.util.Iterator;

/**
 * @author lkmc2
 * @date 2018/9/3
 * @description 餐厅菜单迭代器
 */
public class DinerMenuIterator implements Iterator {
    private MenuItem[] items; // 菜单子项数组
    private int position; // 当前迭代器的位置

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        // 迭代器位置在合理范围内
        return (position < items.length) && (items[position] != null);
    }

    @Override
    public MenuItem next() {
        // 返回下一项菜单子项
        return items[position++];
    }

    @Override
    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException("菜单数组中已没有元素，无法移除");
        }

        if (items[position - 1] != null) {
            // 将被删除元素后面的元素全都向前移动一位
            for (int i = position - 1; i < items.length - 1; i++) {
                items[i] = items[i + 1];
            }
//            下一行代码等效于上面的for循环
//            System.arraycopy(items, position, items, position - 1, items.length - position - 2);
            items[items.length - 1] = null;
        }
    }
}
