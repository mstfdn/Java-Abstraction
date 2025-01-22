package org.example.rpg;

public abstract class Monster {
    private String name;
    private int hitPoint; // Changed from String to double
    private double damage;

    public Monster(String name, int hitPoint, double damage) { // Changed hitPoint type to double
        this.name = name;
        this.hitPoint = hitPoint;
        this.damage = damage;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHitPoint() {
        return hitPoint;
    }

    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    // Abstract method
    public abstract double attack();

    public int getHitPoints() {
        return 0;
    }
}
