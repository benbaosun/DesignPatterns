package IteratorPattern.menu;

import IteratorPattern.component.MenuComponent;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author lkmc2
 * @date 2018/9/3
 * @description 菜单
 */
public class Menu extends MenuComponent {
    private String name; // 菜单名
    private String description; // 描述
    private List<MenuComponent> menuComponentList; // 子菜单列表

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;

        menuComponentList = new LinkedList<>();
    }

    @Override
    public void add(MenuComponent menuComponent) {
        // 添加子菜单
        menuComponentList.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        // 移除子菜单
        menuComponentList.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int index) {
        // 根据下标获取子菜单
        return menuComponentList.get(index);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void print() {
        System.out.print("\n" + getName());
        System.out.println("，" + getDescription());
        System.out.println("--------------------");

        // 遍历子菜单进行打印
        for (MenuComponent menuComponent : menuComponentList) {
            menuComponent.print();
        }
    }
}
