package factory.simplemethodfacotry;

import factory.pizza.BasePizza;
import factory.pizza.PizzaB;

public class PizzBFactory implements IBasePizzaFactory {
    @Override
    public BasePizza createPizza() {
        PizzaB pizzaB = new PizzaB();
        pizzaB.setName("工厂方法pizzaA");
        return pizzaB;
    }
}