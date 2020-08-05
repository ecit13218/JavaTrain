package factory.simplemethodfacotry;

import factory.pizza.BasePizza;
import factory.pizza.PizzaA;

//具体工厂实现
public class PizzaAFactory implements IBasePizzaFactory {
    @Override
    public BasePizza createPizza() {
        PizzaA pizzaA = new PizzaA();
        pizzaA.setName("工厂方法pizzaA");
        return pizzaA;
    }
}