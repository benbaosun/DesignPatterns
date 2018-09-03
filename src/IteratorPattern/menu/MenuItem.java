package IteratorPattern.menu;

import IteratorPattern.component.MenuComponent;

/**
 * @author lkmc2
 * @date 2018/9/3
 * @description 菜单子项
 */
public class MenuItem extends MenuComponent {
    private String name; // 名称
    private String description; // 描述
    private boolean vegetarian; // 是否为素材
    private double price; // 价格

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void print() {
        System.out.print(getName());
        if (isVegetarian()) {
            System.out.print("[蔬菜]");
        }
        System.out.print("，" + getPrice());
        System.out.println(" -- " + getDescription());
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", vegetarian=" + vegetarian +
                ", price=" + price +
                '}';
    }
}
