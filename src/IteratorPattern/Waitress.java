package IteratorPattern;

import IteratorPattern.menu.Menu;
import IteratorPattern.menu.MenuItem;

import java.util.Iterator;
import java.util.List;

/**
 * @author lkmc2
 * @date 2018/9/3
 * @description 服务员
 */
public class Waitress {
    private List<Menu> menus; // 各餐厅的菜单列表

    public Waitress(List<Menu> menus) {
        this.menus = menus;
    }

    // 打印全部菜单
    public void printMenu() {
        for (Menu menu : menus) {
            // 创建菜单的迭代器并打印
            printMenu(menu.createIterator());
        }
    }

    // 打印迭代器里面的菜单
    private void printMenu(Iterator iterator) {
        // 还有下一项，打印菜单
        while (iterator.hasNext()) {
            MenuItem item = (MenuItem) iterator.next();
            System.out.println(item);
        }
    }
}
