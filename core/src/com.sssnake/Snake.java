// File: core/src/com/yourname/snakegame/Snake.java
package com.sssnake; // Make sure this matches your package structure

import java.util.LinkedList;

import com.badlogic.gdx.math.Vector2;

public class Snake {
    // For now, just define the Direction enum and basic structure
    // You'll implement the full logic later

    public enum Direction {
        UP, DOWN, LEFT, RIGHT
    }

    private LinkedList<Vector2> body; // Will hold segments
    private Direction direction;
    // Add other necessary fields (nextDirection, justAte, etc.)

    public Snake() {
        // Initialize body, direction, etc.
        body = new LinkedList<>();
        // Example: start with one segment in the middle
        body.add(new Vector2(10, 10)); // Adjust starting position as needed
        direction = Direction.RIGHT;
        // Initialize other fields
    }

    // Add placeholder methods (implement them properly later)
    public void setDirection(Direction newDirection) {
        // Implement direction change logic
        this.direction = newDirection; // Simplified for now
    }

    public void update() {
        // Implement snake movement logic
        System.out.println("Snake updating..."); // Placeholder
    }

    public boolean checkCollision() {
        // Implement wall and self collision logic
        return false; // Placeholder
    }

    public boolean checkFoodCollision(Vector2 foodPosition) {
        // Implement food collision logic
        return false; // Placeholder
        // Example: return body.getFirst().equals(foodPosition);
    }

    public void grow() {
        // Implement snake growth logic
        System.out.println("Snake growing..."); // Placeholder
    }

    public LinkedList<Vector2> getBody() {
        return body;
    }

    public void reset() {
        // Implement reset logic
        body.clear();
        body.add(new Vector2(10, 10)); // Reset to starting position
        direction = Direction.RIGHT;
    }
    // Add other necessary methods...
}