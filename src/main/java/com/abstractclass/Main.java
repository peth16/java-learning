package com.abstractclass;

abstract class basic {
    abstract void sound();

    void sleep(){
        System.out.println("Animal is Sleeping");
    }
}

//SubClass 1
class Dog extends basic{
    @Override
    void sound() {
        System.out.println("Dog Barks");
    }
}

//SubClass 2
class Cat extends basic{
    @Override
    void sound() {
        System.out.println("Cat Meows");
    }
}

//Main Class
public class Main{

    public static void main(String[] args){

        basic dog = new Dog();

        dog.sound();
        dog.sleep();

        basic cat = new Cat();
        cat.sound();

    }

}