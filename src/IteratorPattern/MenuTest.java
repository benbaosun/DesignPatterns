package IteratorPattern;

import IteratorPattern.menu.DinerMenu;
import IteratorPattern.menu.MenuItem;
import IteratorPattern.menu.PancakeHouseMenu;

import java.util.List;

/**
 * @author lkmc2
 * @date 2018/9/3
 * @description 菜单测试
 */
public class MenuTest {

    public static void main(String[] args) {
        printMenu(); // 打印出餐单上每一项
    }

    // 打印出餐单上每一项
    private static void printMenu() {
        // 获取煎饼屋的菜单列表（早餐）
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        List<MenuItem> breakfastItems = pancakeHouseMenu.getMenuItems();

        // 获取餐厅的菜单数组（午餐）
        DinerMenu dinerMenu = new DinerMenu();
        MenuItem[] lunchItems = dinerMenu.getMenuItems();

        System.out.println("早餐：");
        for (MenuItem breakfastItem : breakfastItems) {
            System.out.println(breakfastItem);
        }

        System.out.println("午餐：");
        for (MenuItem lunchItem : lunchItems) {
            System.out.println(lunchItem);
        }
    }

}
