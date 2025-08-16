// File: core/src/com/yourname/snakegame/Food.java
package com.yourname.sssnake; // Make sure this matches your package structure

import com.badlogic.gdx.math.Vector2;

public class Food {
    private Vector2 position;

    public Food() {
        position = new Vector2(); // Initialize the position vector
    }

    public void spawn(Snake snake) {
        // Implement logic to place food in a random, valid location
        // For now, just set a fixed position or a simple placeholder
        System.out.println("Spawning food...");
        position.set(5, 5); // Placeholder position
        // You'll implement the real random logic later
    }

    public Vector2 getPosition() {
        return position;
    }
    // Add other necessary methods...
}