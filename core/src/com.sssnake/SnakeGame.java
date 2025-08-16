package com.sssnake; // <-- CHANGE THIS to YOUR package name if different

// Import the necessary LibGDX Game class
import com.badlogic.gdx.Game;

/**
 * The main game class. This class extends com.badlogic.gdx.Game
 * and is responsible for managing different screens (e.g., menu, gameplay).
 */
public class SnakeGame extends Game {

    /**
     * The create() method is called once when the game is initialized.
     * It's the standard place to set up initial resources and the first screen.
     */
    @Override
    public void create() {
        // For now, we'll just print a message to confirm it's working.
        // Later, you'll initialize and set your first screen here (e.g., GameScreen).
        System.out.println("SnakeGame created!");

        // TODO: Initialize your first screen and set it:
        // this.setScreen(new GameScreen()); // Assuming you create GameScreen later
    }

    /**
     * The render() method is called every frame.
     * The super.render() call is important as it delegates rendering to the currently active screen.
     */
    @Override
    public void render() {
        super.render(); // This is crucial! It ensures the current screen's render method is called.
    }

    /**
     * The dispose() method is called when the game is closing.
     * It's used to free up resources (like textures, sounds) to prevent memory leaks.
     * The super.dispose() call handles disposing resources managed by the Game class itself.
     */
    @Override
    public void dispose() {
        super.dispose(); // Important for cleanup
        // TODO: Dispose of any resources you create in other classes/screens here.
    }

    // You might also override other methods like resize(), pause(), resume()
    // if you need specific logic at the game level (not just screen level).
    // Often, logic is handled within individual screens.
}