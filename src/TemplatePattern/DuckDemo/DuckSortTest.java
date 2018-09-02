package TemplatePattern.DuckDemo;

import java.util.Arrays;

/**
 * @author lkmc2
 * @date 2018/9/2
 * @description 鸭子排序测试
 */
public class DuckSortTest {

    public static void main(String[] args) {
        Duck[] ducks = {
            new Duck("Kim", 8),
            new Duck("Wang", 2),
            new Duck("Fly", 7),
            new Duck("Andy", 13),
            new Duck("Jack", 22),
            new Duck("Lucy", 5)
        };

        System.out.println("排序前：");
        display(ducks);

        Arrays.sort(ducks); // 对鸭子进行排序

        System.out.println("排序后：");
        display(ducks);
    }

    private static void display(Duck[] ducks) {
        for (Duck duck : ducks) {
            System.out.println(duck);
        }
    }

}
