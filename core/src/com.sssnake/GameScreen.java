package com.sssnake; // Adjust 'yourname' to your actual package name

import com.badlogic.gdx.Screen; // Import the Screen interface
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.badlogic.gdx.utils.viewport.FitViewport; // Or another viewport type


public class GameScreen implements Screen {
    // ... inside public class GameScreen implements Screen {
    private OrthographicCamera camera;
private Viewport viewport;
private ShapeRenderer shapeRenderer; // Or SpriteBatch later

private Snake snake; // Assuming you have a Snake class
private Food food;   // Assuming you have a Food class

private float timeAccumulator = 0f;
private boolean gameOver = false;
private int score = 0;

    @Override
    public void show() {
        // Called when this screen becomes the current screen.
        // Initialize resources, objects, set up the camera, etc.
    }

    @Override
    public void render(float delta) {
        // Called every frame.
        // Handle input, update game state, clear the screen, and draw everything.
        // 'delta' is the time elapsed since the last frame (in seconds).
    }

    @Override
    public void resize(int width, int height) {
        // Called when the screen size changes.
        // Update the camera and viewport accordingly.
    }

    @Override
    public void pause() {
        // Called when the application is paused.
        // Handle pause logic if needed.
    }

    @Override
    public void resume() {
        // Called when the application is resumed from a paused state.
        // Handle resume logic if needed.
    }

    @Override
    public void hide() {
        // Called when this screen is no longer the current screen.
        // Perform any necessary cleanup *before* the screen is destroyed.
    }

    @Override
    public void dispose() {
        // Called when this screen is destroyed.
        // Dispose of all resources (e.g., textures, sounds, renderers) created by this screen.
    }

// } // Closing brace for the class
}
