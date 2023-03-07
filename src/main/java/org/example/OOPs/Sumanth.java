package org.example.OOPs;

interface Human {

    public abstract void method();

    default void game() {
        int a = 3;
        int b = 8;
        System.out.println(a + b);
    }

    public static void run() {
        System.out.println("I am a static method and I can be called only using interface");
    }
}
public class Sumanth implements Human{

    @Override
    public void method() {
        System.out.println("Hi there! I am from Sumanth's class");
    }

    @Override
    public void game() {
        System.out.println(3+3);
    }
    public static void main(String[] args) {
        Human h = new Sumanth();
        h.game();
        h.method();
        Human.run();
    }
}

