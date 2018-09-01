package DecoratorPattern;

/**
 * @author lkmc2
 * @date 2018/9/1
 * @description 饮料
 */

public abstract class Beverage {
    protected String description; // 描述
    private boolean milk; // 是否有牛奶
    private boolean soy; // 是否有豆浆
    private boolean mocha; // 是否有摩卡
    private boolean whip; // 是否有奶泡

    // 获取饮料描述
    public abstract String getDescription();

    // 计算饮料总价
    public double cost() {
        double totalPrice = 0;

        if (hasMilk()) {
            totalPrice += 10;
        }
        if (hasSoy()) {
            totalPrice += 13;
        }
        if (hasMocha()) {
            totalPrice += 8;
        }
        if (hasWhip()) {
            totalPrice += 5;
        }
        return totalPrice;
    }

    public boolean hasMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public boolean hasSoy() {
        return soy;
    }

    public void setSoy(boolean soy) {
        this.soy = soy;
    }

    public boolean hasMocha() {
        return mocha;
    }

    public void setMocha(boolean mocha) {
        this.mocha = mocha;
    }

    public boolean hasWhip() {
        return whip;
    }

    public void setWhip(boolean whip) {
        this.whip = whip;
    }

}
