package org.example.rpg;

import org.example.rpg.utils.Constant;

public class Werewolf extends Monster implements Bleedable {
    public Werewolf(String name, int hitPoint, double damage) {
        super(name, hitPoint, damage);
    }

    @Override
    public double bleed() {
        return getDamage() * Constant.BLEED_PERCENTAGE;
    }

    @Override
    public double bleed(int level) {
        return level * getDamage() * Constant.BLEED_PERCENTAGE;
    }

    @Override
    public double attack() {
        return getDamage() + bleed();
    }
}
