package engine.scenes;

import engine.Window;
import engine.listeners.KeyListener;
import engine.managers.Scene;

import java.awt.event.KeyEvent;

public class LevelEditorScene extends Scene {

    private boolean changingScene = false;
    private float timeToChangeScene = 2.0f;

    public LevelEditorScene() {
        System.out.println("Inside Level Editor Scene");
    }

    @Override
    public void update(float deltaTime) {

        System.out.println((1.0f / deltaTime) + "FPS");

        if (!changingScene && KeyListener.isKeyPressed(KeyEvent.VK_SPACE)) {
            changingScene = true;
        }

        if (changingScene && timeToChangeScene > 0) {
            timeToChangeScene -= deltaTime;
            Window.get().red -= deltaTime * 5.0f;
            Window.get().green -= deltaTime * 5.0f;
            Window.get().blue -= deltaTime * 5.0f;
        } else if (changingScene) {
            Window.changeScene(1);
        }
    }
}
