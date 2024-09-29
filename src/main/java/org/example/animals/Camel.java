package org.example.animals;
import org.example.Type_Food.Herbivore;
import org.example.Viev.Overland;

public class Camel implements Herbivore, Overland {

    @Override
    public void eat() {
        System.out.println("Camel eat grass");
    }

    @Override
    public void walk() {
        System.out.println("Camel walk");
    }
}
