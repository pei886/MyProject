package com.pjy.yaya;

public class Cats implements Animals{

    @Override
    public void animalSound() {
        System.out.println("Meow!");
    }

    @Override
    public void run() {
        System.out.println("Kittie runs towards you!") ;
    }

    @Override
    public void sleep() {
        System.out.println("Zzzzz");
    }
}
