package ProxyPattern.VirtualProxy;

import javax.swing.*;
import java.awt.*;

/**
 * @author lkmc2
 * @date 2018/9/4
 * @description 图片组件
 */
public class ImageComponent extends JComponent {
    private Icon icon; // 图标

    public ImageComponent(Icon icon) {
        this.icon = icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = icon.getIconWidth();
        int height = icon.getIconHeight();
        int x = (800 - width) / 2;
        int y = (600 - height) / 2;

        // 绘制图标
        icon.paintIcon(this, g, x, y);
    }
}
