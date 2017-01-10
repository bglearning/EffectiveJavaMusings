package org.effectivejava.musings.chapter02.item01;

public class Person {

    private boolean life;

    private Person(boolean life) {
        this.life = life;
    }

    public static Person createProgrammer() {
       return new Person(false); 
    }

    public static Person createNonProgrammer() {
       return new Person(true); 
    }

    public boolean hasLife() {
        return life;
    }

    public static void main(String[] args) {
        Person a = Person.createProgrammer();
        Person b = Person.createNonProgrammer();

        System.out.println(a.hasLife());
        System.out.println(b.hasLife());
    }

}
