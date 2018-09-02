package TemplatePattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author lkmc2
 * @date 2018/9/2
 * @description 咖啡（带钩子方法）
 */
public class CoffeeWithHook extends CaffeineBeverageWithHook {

    @Override
    protected void brew() {
        System.out.println("冲泡咖啡");
    }

    @Override
    protected void addCondiments() {
        System.out.println("加糖加奶");
    }

    @Override
    protected boolean customerWantsCondiments() {
        String answer = getUserInput(); // 获取用户输入
        return answer.toLowerCase().startsWith("y");
    }

    // 获取用户输入
    private String getUserInput() {
        String answer = null;
        System.out.println("请问要在咖啡里添加牛奶或糖么？[输入y或n]");

        try {
            BufferedReader reader = new BufferedReader(
                                        new InputStreamReader(System.in));
            answer = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (answer == null) {
            answer = "n";
        }
        return answer;
    }
}
