package ru.java.oop.polymorphizm.weapon;

public class Pistol extends Weapon {
    @Override
    public void shot() {
        System.out.println("Пиу-Пиу");
    }
}
