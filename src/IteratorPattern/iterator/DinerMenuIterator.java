package IteratorPattern.iterator;

import IteratorPattern.menu.MenuItem;

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
}
