package com.epam.mjc.stage0;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        System.out.println(dog.getDescription());
        Animal bird = new Bird();
        System.out.println(bird.getDescription());
    }
}
