package it.academy.MayExam;

import it.academy.MayExam.Entity.Factory;
import it.academy.MayExam.Singleton.FactoryItem;
import it.academy.MayExam.Singleton.Restaurant;

public class Main {
    public static void main(String[] args) {
        Factory factory=new Factory();
        FactoryItem restaurant=factory.getFactoryItem("R");
        System.out.println(restaurant.getClass());
        FactoryItem cinema=factory.getFactoryItem("C");

    }
}
