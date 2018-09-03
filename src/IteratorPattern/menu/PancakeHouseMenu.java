package IteratorPattern.menu;

import IteratorPattern.iterator.Iterator;
import IteratorPattern.iterator.PancakeHouseMenuIterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lkmc2
 * @date 2018/9/3
 * @description 煎饼屋的菜单
 */
public class PancakeHouseMenu {
    private List<MenuItem> menuItems; // 菜单列表

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();

        // 初始化菜单
        addItem("煎饼早餐", "鸡蛋、蔬菜、面包", true, 3.0);
        addItem("烤煎饼", "鸡蛋、面包、芒果", true, 3.0);
        addItem("红烧煎饼", "排骨、鸡蛋、蔬菜、面包", false, 8.0);
        addItem("牛肉煎饼", "牛肉、芝士、鸡蛋、蔬菜、面包", false, 12.0);
    }

    // 添加菜单子项到列表
    private void addItem(String name, String description,
                         boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    // 创建菜单迭代器
    public Iterator createIterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }
}
