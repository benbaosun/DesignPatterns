package TemplatePattern.DuckDemo;

/**
 * @author lkmc2
 * @date 2018/9/2
 * @description 鸭子
 */
public class Duck implements Comparable<Duck> {
    private String name; // 名字
    private int weight; // 重量

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public int compareTo(Duck otherDuck) {
        if (this.weight < otherDuck.weight) {
            return -1;
        } else if (this.weight > otherDuck.weight) {
            return 1;
        } else {
            return 0;
        }
//        return Integer.compare(this.weight, otherDuck.weight);（等效写法）
    }

    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
