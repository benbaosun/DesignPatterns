package IteratorPattern;

import IteratorPattern.menu.Menu;
import IteratorPattern.menu.MenuItem;

import java.util.Iterator;

/**
 * @author lkmc2
 * @date 2018/9/3
 * @description 服务员
 */
public class Waitress {
    private Menu pancakeHouseMenu; // 煎饼屋的菜单
    private Menu dinerMenu; // 餐厅菜单
    private Menu cafeMenu; // 咖啡厅菜单

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
        this.cafeMenu = cafeMenu;
    }

    // 打印全部菜单
    public void printMenu() {
        // 创建煎饼屋菜单的迭代器
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        // 创建餐厅菜单的迭代器
        Iterator dinerIterator = dinerMenu.createIterator();
        // 创建咖啡厅的迭代器
        Iterator<MenuItem> cafeIterator = cafeMenu.createIterator();

        System.out.println("----- 菜单 -----");
        System.out.println("早餐：");
        printMenu(pancakeIterator);
        System.out.println("----------------");
        System.out.println("午餐：");
        printMenu(dinerIterator);
        System.out.println("----------------");
        System.out.println("晚餐：");
        printMenu(cafeIterator);
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
