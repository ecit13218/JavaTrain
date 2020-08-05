package factory.abstractfactory;

import factory.pizza.BasePizza;

//超级工厂
public interface IBaseAbsPizzaFactory {
    BasePizza createPizza(String type);
}