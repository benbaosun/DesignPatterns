package TemplatePattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author lkmc2
 * @date 2018/9/2
 * @description 茶
 */
public class TeaWithHook extends CaffeineBeverageWithHook {

    @Override
    protected void brew() {
        System.out.println("冲泡茶包");
    }

    @Override
    protected void addCondiments() {
        System.out.println("加柠檬");
    }

    @Override
    protected boolean customerWantsCondiments() {
        String answer = getUserInput(); // 获取用户输入
        return answer.toLowerCase().startsWith("y");
    }

    // 获取用户输入
    private String getUserInput() {
        String answer = null;
        System.out.println("请问要在咖啡里添加柠檬么？[输入y或n]");

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
