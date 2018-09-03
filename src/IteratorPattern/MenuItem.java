package IteratorPattern;

/**
 * @author lkmc2
 * @date 2018/9/3
 * @description 菜单子项
 */
public class MenuItem {
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

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public double getPrice() {
        return price;
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
