package IteratorPattern;

import IteratorPattern.menu.CafeMenu;
import IteratorPattern.menu.DinerMenu;
import IteratorPattern.menu.Menu;
import IteratorPattern.menu.PancakeHouseMenu;

/**
 * @author lkmc2
 * @date 2018/9/3
 * @description 菜单测试
 */
public class MenuTest {

    public static void main(String[] args) {
        // 煎饼屋菜单
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        // 餐厅菜单
        Menu dinerMenu = new DinerMenu();
        // 咖啡厅菜单
        Menu cafeMenu = new CafeMenu();

        // 带有菜单的服务员
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);
        // 打印菜单
        waitress.printMenu();

        /*
            运行结果：
            ----- 菜单 -----
            早餐：
            MenuItem{name='煎饼早餐', description='鸡蛋、蔬菜、面包', vegetarian=true, price=3.0}
            MenuItem{name='烤煎饼', description='鸡蛋、面包、芒果', vegetarian=true, price=3.0}
            MenuItem{name='红烧煎饼', description='排骨、鸡蛋、蔬菜、面包', vegetarian=false, price=8.0}
            MenuItem{name='牛肉煎饼', description='牛肉、芝士、鸡蛋、蔬菜、面包', vegetarian=false, price=12.0}
            ----------------
            午餐：
            MenuItem{name='水煮牛肉', description='牛肉、辣椒、豆芽', vegetarian=false, price=24.0}
            MenuItem{name='红烧鱼', description='鱼、秘制酱汁', vegetarian=false, price=18.0}
            MenuItem{name='虎皮凤爪', description='鸡爪、秘制酱汁', vegetarian=false, price=22.0}
            MenuItem{name='手拍黄瓜', description='黄瓜、辣椒、醋', vegetarian=true, price=12.0}
            ----------------
            晚餐：
            MenuItem{name='美式咖啡', description='咖啡', vegetarian=true, price=18.0}
            MenuItem{name='卡布奇诺咖啡', description='咖啡', vegetarian=true, price=19.0}
            MenuItem{name='巧克力蛋糕', description='巧克力、鸡蛋、奶油', vegetarian=true, price=22.0}
            MenuItem{name='牛肉汉堡', description='牛肉、蔬菜、辣酱', vegetarian=false, price=18.0}
         */
    }



}
