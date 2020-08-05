package factory.abstractfactory;

import factory.pizza.BasePizza;
import factory.pizza.PizzaA;
import factory.pizza.PizzaB;

public class SuperFactory implements IBaseAbsPizzaFactory {
    @Override
    public BasePizza createPizza(String type) {
        if ("A".equals(type)) {
            return new PizzaA();
        } else if ("B".equals(type)) {
            return new PizzaB();
        } else {
            throw new RuntimeException("没有符合条件的pizza");
        }
    }
}