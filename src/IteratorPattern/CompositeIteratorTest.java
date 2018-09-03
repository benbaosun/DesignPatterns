package IteratorPattern;


import IteratorPattern.component.MenuComponent;
import IteratorPattern.iterator.CompositeIterator;
import IteratorPattern.menu.Menu;
import IteratorPattern.menu.MenuItem;

/**
 * @author lkmc2
 * @date 2018/9/3
 * @description 组合迭代器测试
 */
public class CompositeIteratorTest {

    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("煎饼店菜单", "早餐");
        MenuComponent dinerMenu = new Menu("餐厅菜单", "午餐");
        MenuComponent cafeMenu = new Menu("咖啡店菜单", "晚餐");

        // 将各店的菜单添加到菜单列表
        MenuComponent allMenus = new Menu("所有菜单", "包含所有店的菜单");
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        // 给煎饼店添加子菜单
        pancakeHouseMenu.add(new MenuItem("煎饼早餐", "鸡蛋、蔬菜、面包", true, 3.0));
        pancakeHouseMenu.add(new MenuItem("烤煎饼", "鸡蛋、面包、芒果", true, 3.0));
        pancakeHouseMenu.add(new MenuItem("红烧煎饼", "排骨、鸡蛋、蔬菜、面包", false, 8.0));

        // 给餐厅添加子菜单
        dinerMenu.add(new MenuItem("水煮牛肉", "牛肉、辣椒、豆芽", false, 24));
        dinerMenu.add(new MenuItem("红烧鱼", "鱼、秘制酱汁", false, 18));
        dinerMenu.add(new MenuItem("虎皮凤爪", "鸡爪、秘制酱汁", false, 22));
        dinerMenu.add(new MenuItem("手拍黄瓜", "黄瓜、辣椒、醋", true, 12));

        // 给甜点菜单添加子菜单
        MenuComponent dessertMenu = new Menu("甜点菜单", "甜点");
        dessertMenu.add(new MenuItem("冰淇淋", "甜点", false, 3.0));
        dessertMenu.add(new MenuItem("水果布丁", "甜点", false, 12.0));

        // 给咖啡厅添加子菜单
        cafeMenu.add(new MenuItem("美式咖啡", "咖啡", true, 18.0));
        cafeMenu.add(new MenuItem("卡布奇诺咖啡", "咖啡", true, 19.0));
        cafeMenu.add(dessertMenu); // 添加带子菜单的子菜单

        testCompositeIterator(allMenus);

        /*
            运行结果：（有重复）
            IteratorPattern.menu.Menu@4554617c
            MenuItem{name='煎饼早餐', description='鸡蛋、蔬菜、面包', vegetarian=true, price=3.0}
            MenuItem{name='烤煎饼', description='鸡蛋、面包、芒果', vegetarian=true, price=3.0}
            MenuItem{name='红烧煎饼', description='排骨、鸡蛋、蔬菜、面包', vegetarian=false, price=8.0}
            MenuItem{name='煎饼早餐', description='鸡蛋、蔬菜、面包', vegetarian=true, price=3.0}
            MenuItem{name='烤煎饼', description='鸡蛋、面包、芒果', vegetarian=true, price=3.0}
            MenuItem{name='红烧煎饼', description='排骨、鸡蛋、蔬菜、面包', vegetarian=false, price=8.0}
            IteratorPattern.menu.Menu@74a14482
            MenuItem{name='水煮牛肉', description='牛肉、辣椒、豆芽', vegetarian=false, price=24.0}
            MenuItem{name='红烧鱼', description='鱼、秘制酱汁', vegetarian=false, price=18.0}
            MenuItem{name='虎皮凤爪', description='鸡爪、秘制酱汁', vegetarian=false, price=22.0}
            MenuItem{name='手拍黄瓜', description='黄瓜、辣椒、醋', vegetarian=true, price=12.0}
            MenuItem{name='水煮牛肉', description='牛肉、辣椒、豆芽', vegetarian=false, price=24.0}
            MenuItem{name='红烧鱼', description='鱼、秘制酱汁', vegetarian=false, price=18.0}
            MenuItem{name='虎皮凤爪', description='鸡爪、秘制酱汁', vegetarian=false, price=22.0}
            MenuItem{name='手拍黄瓜', description='黄瓜、辣椒、醋', vegetarian=true, price=12.0}
            IteratorPattern.menu.Menu@1540e19d
            MenuItem{name='美式咖啡', description='咖啡', vegetarian=true, price=18.0}
            MenuItem{name='卡布奇诺咖啡', description='咖啡', vegetarian=true, price=19.0}
            IteratorPattern.menu.Menu@677327b6
            MenuItem{name='冰淇淋', description='甜点', vegetarian=false, price=3.0}
            MenuItem{name='水果布丁', description='甜点', vegetarian=false, price=12.0}
            MenuItem{name='冰淇淋', description='甜点', vegetarian=false, price=3.0}
            MenuItem{name='水果布丁', description='甜点', vegetarian=false, price=12.0}
            MenuItem{name='美式咖啡', description='咖啡', vegetarian=true, price=18.0}
            MenuItem{name='卡布奇诺咖啡', description='咖啡', vegetarian=true, price=19.0}
            IteratorPattern.menu.Menu@677327b6
            MenuItem{name='冰淇淋', description='甜点', vegetarian=false, price=3.0}
            MenuItem{name='水果布丁', description='甜点', vegetarian=false, price=12.0}
            MenuItem{name='冰淇淋', description='甜点', vegetarian=false, price=3.0}
            MenuItem{name='水果布丁', description='甜点', vegetarian=false, price=12.0}
            MenuItem{name='冰淇淋', description='甜点', vegetarian=false, price=3.0}
            MenuItem{name='水果布丁', description='甜点', vegetarian=false, price=12.0}
         */
    }

    private static void testCompositeIterator(MenuComponent component) {
        CompositeIterator iterator = new CompositeIterator(component.createIterator());

        while (iterator.hasNext()) {
            MenuComponent menuComponent = iterator.next();
            System.out.println(menuComponent);
        }
    }
}