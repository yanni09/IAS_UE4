package games.basic.gameObjects.interfaces;
import games.basic.position.interfaces.Positionable;

public interface SimpleGameObject {
    Positionable getPos();
    int getWidth();
    int getHeight();
}
