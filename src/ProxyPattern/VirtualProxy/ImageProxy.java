package ProxyPattern.VirtualProxy;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * @author lkmc2
 * @date 2018/9/4
 * @description 图片代理（代理模式）
 */
public class ImageProxy implements Icon {
    private ImageIcon imageIcon; // 图标
    private URL imageUrl; // 图片网址
    private Thread retrievalThread; // 图片下载执行线程
    private boolean retrieving = false; // 是否开始下载图片

    public ImageProxy(URL imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        if (imageIcon != null) {
            imageIcon.paintIcon(c, g, x, y);
        } else {
            g.drawString("正在加载CD封面，请稍后……", x + 300, y + 190);

            // 未开始下载图片
            if (!retrieving) {
                retrieving = true; // 设置下载状态为真

                // 执行线程下载图片
                retrievalThread = new Thread(() -> {
                    imageIcon = new ImageIcon(imageUrl, "CD封面");
                    c.repaint(); // 重绘界面
                });
                retrievalThread.start();
            }
        }
    }

    @Override
    public int getIconWidth() {
        if (imageIcon != null) {
            return imageIcon.getIconWidth();
        }
        return 800;
    }

    @Override
    public int getIconHeight() {
        if (imageIcon != null) {
            return imageIcon.getIconHeight();
        }
        return 600;
    }
}
