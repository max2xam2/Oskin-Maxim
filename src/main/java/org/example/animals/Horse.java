package org.example.animals;
import org.example.Type_Food.Herbivore;
import org.example.Viev.Overland;

public class Horse implements Herbivore, Overland {

    @Override
    public void eat() {
        System.out.println("Horse eat grass");
    }

    @Override
    public void walk() {
        System.out.println("Horse walk");
    }
}
