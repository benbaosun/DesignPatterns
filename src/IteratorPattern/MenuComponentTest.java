package IteratorPattern;

import IteratorPattern.component.MenuComponent;
import IteratorPattern.menu.Menu;
import IteratorPattern.menu.MenuItem;

/**
 * @author lkmc2
 * @date 2018/9/3
 * @description 组合模式的菜单测试
 */
public class MenuComponentTest {

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

        // 服务员
        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu(); // 打印全部菜单

        /*
            运行结果：
            所有菜单，包含所有店的菜单
            --------------------

            煎饼店菜单，早餐
            --------------------
              煎饼早餐[蔬菜]，3.0 -- 鸡蛋、蔬菜、面包
              烤煎饼[蔬菜]，3.0 -- 鸡蛋、面包、芒果
              红烧煎饼，8.0 -- 排骨、鸡蛋、蔬菜、面包

            餐厅菜单，午餐
            --------------------
              水煮牛肉，24.0 -- 牛肉、辣椒、豆芽
              红烧鱼，18.0 -- 鱼、秘制酱汁
              虎皮凤爪，22.0 -- 鸡爪、秘制酱汁
              手拍黄瓜[蔬菜]，12.0 -- 黄瓜、辣椒、醋

            咖啡店菜单，晚餐
            --------------------
              美式咖啡[蔬菜]，18.0 -- 咖啡
              卡布奇诺咖啡[蔬菜]，19.0 -- 咖啡

            甜点菜单，甜点
            --------------------
              冰淇淋，3.0 -- 甜点
              水果布丁，12.0 -- 甜点
         */

        System.out.println("------------ 素菜 -------------");
        waitress.printVegetarianMenu(); // 只打印素菜
        /*
            运行结果：
            ------------ 素菜 -------------
              煎饼早餐[蔬菜]，3.0 -- 鸡蛋、蔬菜、面包
              烤煎饼[蔬菜]，3.0 -- 鸡蛋、面包、芒果
              手拍黄瓜[蔬菜]，12.0 -- 黄瓜、辣椒、醋
              美式咖啡[蔬菜]，18.0 -- 咖啡
              卡布奇诺咖啡[蔬菜]，19.0 -- 咖啡
         */
    }

}
