package IteratorAndCompositePattern;

import IteratorAndCompositePattern.component.MenuComponent;

import java.util.Iterator;

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

    // 打印素菜
    public void printVegetarianMenu() {
        Iterator<MenuComponent> iterator = allMenus.createIterator();

        while (iterator.hasNext()) {
            MenuComponent menuComponent = iterator.next();
            // 打印素菜（只有MenuItem支持isVegetarian）
            try {
                if (menuComponent.isVegetarian()) {
                    menuComponent.print();
                }
            } catch (UnsupportedOperationException ignored) {
            }
        }
    }
}
