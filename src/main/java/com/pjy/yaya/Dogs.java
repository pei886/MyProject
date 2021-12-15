package com.pjy.yaya;

public class Dogs implements Animals{
    @Override
    public void run() {
        System.out.println("Dog runs towards you!");
    }

    public void animalSound(){
        System.out.println("Bark!");
    }

    public void sleep(){
        System.out.println("Zzzzz");
    }
}
