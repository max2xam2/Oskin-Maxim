package org.example.animals;
import org.example.Type_Food.Predator;
import org.example.Viev.Overland;

public class Tiger implements Predator, Overland {

    @Override
    public void eat() {
        System.out.println("Tiger eat beef");
    }

    @Override
    public void walk() {
        System.out.println("Tiger walk");
    }

}
