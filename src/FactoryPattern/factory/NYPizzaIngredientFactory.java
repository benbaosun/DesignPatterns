package FactoryPattern.factory;

import FactoryPattern.ingredient.*;
import FactoryPattern.ingredient.ny.*;

/**
 * @author lkmc2
 * @date 2018/9/1
 * @description 纽约披萨原料工厂（抽象工厂）
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPeperoni();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }
}
