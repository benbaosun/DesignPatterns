package IteratorPattern;

import IteratorPattern.menu.DinerMenu;
import IteratorPattern.menu.MenuItem;
import IteratorPattern.menu.PancakeHouseMenu;

/**
 * @author lkmc2
 * @date 2018/9/3
 * @description 服务员
 */
public class Waitress {
    private PancakeHouseMenu pancakeHouseMenu; // 煎饼屋的菜单
    private DinerMenu dinerMenu; // 餐厅菜单

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    // 打印全部菜单
    public void printMenu() {
        // 创建煎饼屋菜单的迭代器
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        // 创建餐厅菜单的迭代器
        Iterator dinerIterator = dinerMenu.createIterator();

        System.out.println("----- 菜单 -----");
        System.out.println("早餐：");
        printMenu(pancakeIterator);
        System.out.println("----------------");
        System.out.println("午餐：");
        printMenu(dinerIterator);
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
