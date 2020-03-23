package org.ivangrod.testingpills.exception;

import java.util.Random;

public class Soldier {

    private static final int MAX_DAMAGE = 10;

    private static final int ADDITIONAL_DEFENSE = 10;

    enum Type {
        WARRIOR, DEFENDER
    }

    private final int damage;

    private final int defense;

    private final int health;

    private final boolean swordCarried;

    private final Type type;

    // Static member of the class
    public static class Builder {

        // Required
        private final boolean swordCarried;
        private final Type type;
        private final int health;

        // Optional
        private int damage;

        private int defense;

        // Constructor with required parameters (final)
        public Builder(boolean swordCarried, int health) {
            type = swordCarried ? Type.WARRIOR : Type.DEFENDER;
            this.swordCarried = swordCarried;
            this.health = health;
        }

        // Public accessors
        public Builder damage(int damage) {
            this.damage = damage;

            // To return the same instance of the Builder object
            return this;
        }

        public Builder defense(int defense) {
            this.defense = defense;
            return this;
        }

        public Soldier build() {
            return new Soldier(this);
        }
    }

    // Constructor with BUILDER - replace default constructor
    private Soldier(Builder builder) {
        this.swordCarried = builder.swordCarried;
        this.type = builder.type;
        this.health = builder.health;
        this.damage = builder.damage;
        this.defense = builder.defense;
    }

    public int attack() {
        if (!swordCarried) {
            throw new RuntimeException("This soldier can not attack");
        }

        return this.damage + new Random().nextInt(MAX_DAMAGE);
    }

    public Soldier receiveAttack(int damage) {

        int totalDefense = Type.DEFENDER.equals(this.type) ? this.defense + ADDITIONAL_DEFENSE : this.defense;

        int healthAfterAttack = this.health;
        if (damage > totalDefense) {
            healthAfterAttack = this.health - (totalDefense - damage);
        }

        return new Builder(this.swordCarried, healthAfterAttack).damage(this.damage)
                .defense(this.defense)
                .build();
    }
}
