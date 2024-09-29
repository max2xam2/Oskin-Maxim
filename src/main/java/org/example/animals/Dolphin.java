package org.example.animals;
import org.example.Type_Food.Predator;
import org.example.Viev.Waterfowl;

public class Dolphin implements Predator, Waterfowl {

    public void eat(){
        System.out.println("Dolphin eat fish");
    }

    public void swim() {
        System.out.println("Dolphin swim");
    }
}
