package ru.java.oop.polymorphizm;

import ru.java.oop.polymorphizm.weapon.*;

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

    public void shotWithWeapon(int slot) throws IllegalArgumentException {
        if (slot >= 0 && slot < weaponSlots.length) {
            Weapon weapon = weaponSlots[slot];
            weapon.shot();
        } else throw new IllegalArgumentException();
    }

}