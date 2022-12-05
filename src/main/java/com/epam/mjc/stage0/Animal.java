package com.epam.mjc.stage0;

public class Animal {
    String color;
    int numberOfPaws;
    boolean hasFur;

    Animal(String color, int numberOfPaws, boolean hasFur){
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }
    void getDescription(){
        String fur = this.hasFur?"a":"no";
        if (this.numberOfPaws==1){
            System.out.print("This animal is mostly "+this.color+". It has "+this.numberOfPaws+" paw and "+fur+" fur.");
        }
        else {
            System.out.print("This animal is mostly "+this.color+". It has "+this.numberOfPaws+" paws and "+fur+" fur.");
        }

    }

    public static void main(String[] args) {
        Animal an = new Animal("black",1,false);
        an.getDescription();
        System.out.println();
        Bird bird = new Bird();
        bird.getDescription();
        System.out.println();
        Dog dog = new Dog();
        dog.getDescription();


    }


}
