package IteratorPattern;

import IteratorPattern.component.MenuComponent;

/**
 * @author lkmc2
 * @date 2018/9/3
 * @description 服务员
 */
public class Waitress {
    private MenuComponent allMenus; // 所有餐厅的菜单列表

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    // 打印全部菜单
    public void printMenu() {
        allMenus.print();
    }
}
