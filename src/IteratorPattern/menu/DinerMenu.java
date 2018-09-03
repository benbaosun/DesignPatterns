package IteratorPattern.menu;

import IteratorPattern.iterator.DinerMenuIterator;

import java.util.Iterator;

/**
 * @author lkmc2
 * @date 2018/9/3
 * @description 餐厅菜单
 */
public class DinerMenu implements Menu {
    private static final int MAX_ITEMS = 6; // 最大菜单项
    private int numberOfItems = 0; // 当前点菜数
    private MenuItem[] menuItems; // 菜单项数组

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        // 初始化菜单
        addItem("水煮牛肉", "牛肉、辣椒、豆芽", false, 24);
        addItem("红烧鱼", "鱼、秘制酱汁", false, 18);
        addItem("虎皮凤爪", "鸡爪、秘制酱汁", false, 22);
        addItem("手拍黄瓜", "黄瓜、辣椒、醋", true, 12);
    }

    // 添加菜单子项到数组
    private void addItem(String name, String description,
                         boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);

        // 点菜数超过上限，无法继续添加
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("菜单已满，无法继续点菜");
        } else { // 添加菜单子项到数组
            menuItems[numberOfItems++] = menuItem;
        }
    }

    // 创建迭代器
    public Iterator<MenuItem> createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
