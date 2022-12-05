package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    Animal(String color, int numberOfPaws, boolean hasFur){
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }
    String getDescription(){
        String fur = this.hasFur?"a":"no";
        if (this.numberOfPaws==1){
            String toReturn = "This animal is mostly "+this.color+". It has "+this.numberOfPaws+" paw and "+fur+" fur.";
 return toReturn;
        }
        else {
            String toReturn = "This animal is mostly "+this.color+". It has "+this.numberOfPaws+" paws and "+fur+" fur.";
           return toReturn;
        }

    }

    public static void main(String[] args) {
        Animal an = new Animal("red", 3, true);
        System.out.println(an.getDescription());

        Bird bird = new Bird();
        System.out.println(bird.getDescription());
        System.out.println();
        Dog dog = new Dog();
        System.out.println(dog.getDescription());


    }


}
