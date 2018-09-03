package IteratorPattern.menu;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author lkmc2
 * @date 2018/9/3
 * @description 咖啡厅的菜单
 */
public class CafeMenu extends Menu {
    public CafeMenu(String name, String description) {
        super(name, description);
    }
//    private Map<String, MenuItem> menuItems; // 菜单子项map
//
//    public CafeMenu() {
//        menuItems = new LinkedHashMap<>();
//
//        addItem("美式咖啡", "咖啡", true, 18.0);
//        addItem("卡布奇诺咖啡", "咖啡", true, 19.0);
//        addItem("巧克力蛋糕", "巧克力、鸡蛋、奶油", true, 22.0);
//        addItem("牛肉汉堡", "牛肉、蔬菜、辣酱", false, 18.0);
//    }
//
//    // 添加菜单子项到map
//    private void addItem(String name, String description,
//                         boolean vegetarian, double price) {
//        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
//        menuItems.put(menuItem.getName(), menuItem);
//    }
//
//    @Override
//    public Iterator<MenuItem> createIterator() {
//        return menuItems.values().iterator();
//    }
}
