package factory.simplemethodfacotry;

import factory.pizza.BasePizza;

//声明一个工厂接口
public interface IBasePizzaFactory {
    BasePizza createPizza();
}