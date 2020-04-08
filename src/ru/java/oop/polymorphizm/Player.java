package ru.java.oop.polymorphizm;

import ru.java.oop.polymorphizm.weapon.*;

import java.util.InputMismatchException;

public class Player {
    // Указываем тип данных Weapon, который будет храниться в "слотах игрока"
    private Weapon[] weaponSlots;

    public Player() {
        weaponSlots = new Weapon[]{
                new Pistol(),
                new Rifle(),
                new RPG(),
                new Slingshot(),
                new WaterPistol(),
        };
    }

    public int getSlotsCount() {
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        try {
            Weapon weapon = weaponSlots[slot];
            weapon.shot();
        } catch (IllegalArgumentException e) {
            System.out.println("Incorrect number, please try again");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Incorrect number, please try again");
        }
    }
}