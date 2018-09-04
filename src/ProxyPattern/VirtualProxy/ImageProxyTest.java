package ProxyPattern.VirtualProxy;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author lkmc2
 * @date 2018/9/4
 * @description 图片代理类测试
 */
public class ImageProxyTest {
    private ImageComponent imageComponent; // 图片组件

    private ImageProxyTest() throws MalformedURLException {
        JFrame frame = new JFrame();
        frame.setTitle("风景");
        frame.setBounds(300, 150, 800, 600);

        URL initUrl = new URL("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1536057779237&di=d25791a70b2d2e1ed0389a569530b093&imgtype=0&src=http%3A%2F%2Fpic.58pic.com%2F58pic%2F17%2F47%2F28%2F96s58PICz9j_1024.jpg");
        Icon icon = new ImageProxy(initUrl);
        imageComponent = new ImageComponent(icon);
        frame.getContentPane().add(imageComponent);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) throws MalformedURLException {
        new ImageProxyTest();
    }
}
