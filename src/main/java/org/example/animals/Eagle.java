package org.example.animals;
import org.example.Type_Food.Predator;
import org.example.Viev.Fliegend;

public class Eagle implements Predator, Fliegend {

    @Override
    public void eat() {
        System.out.println("Eagle eat meet");
    }

    @Override
    public void fly() {
        System.out.println("Eagle fly");
    }
}
