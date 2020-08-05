package factory.simplemethodfacotry;

import factory.pizza.BasePizza;

//具体创建pizza工厂类
public class MethodFacotry {
    public static BasePizza createPizza(String type){
        if ("A".equals(type)) {
            return new PizzaAFactory().createPizza();
        } else if ("B".equals(type)) {
            return new PizzBFactory().createPizza();
        }else{
            throw new RuntimeException("没有符合条件的pizza工厂类");
        }
    }

    public static void main(String[] args) {
        System.out.println(createPizza("A"));
        System.out.println(createPizza("B"));
    }
}