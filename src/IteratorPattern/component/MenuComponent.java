package IteratorPattern.component;

/**
 * @author lkmc2
 * @date 2018/9/3
 * @description 菜单组件（组合模式）
 */
public abstract class MenuComponent {

    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public String getName(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public String getDescription(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public double getPrice(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public boolean isVegetarian(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public void print(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

}
