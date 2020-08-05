package factory.simplefactory;

import factory.pizza.BasePizza;
import factory.pizza.PizzaA;
import factory.pizza.PizzaB;

public class SimplePizzaFactory {
    
    public static BasePizza createPizza(String type){
        if ("A".equals(type)) {
            return new PizzaA();
        } else if ("B".equals(type)) {
            return new PizzaB();
        }else{
            throw new RuntimeException("没有符合条件的pizza");
        }
    }

    public static void main(String[] args) {
        System.out.println(createPizza("A"));
        System.out.println(createPizza("B"));
    }
}