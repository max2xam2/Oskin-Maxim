package org.example;

import org.example.Viev.*;
import org.example.animals.*;
import org.example.Type_Food.*;


public class Main {
    public static void main(String[] args) {

        Camel camel = new Camel();
        camel.eat();
        camel.walk();

        Dolphin dolphin = new Dolphin();
        dolphin.eat();
        dolphin.swim();

        Eagle eagle = new Eagle();
        eagle.eat();
        eagle.fly();

        Horse horse = new Horse();
        horse.eat();
        horse.walk();

        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.walk();
    }
}
