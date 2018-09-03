package IteratorPattern.menu;

import IteratorPattern.menu.MenuItem;

import java.util.Iterator;

/**
 * @author lkmc2
 * @date 2018/9/3
 * @description 菜单
 */
public interface Menu {
    // 创建菜单子项的迭代器
    Iterator<MenuItem> createIterator();
}
