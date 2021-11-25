package games.basic.position.interfaces;

public interface Positionable {
    int getX();
    int getY();
    void move(Positionable shift);
    void moveTo(Positionable pos);
    void scale(int factor);
    void scale(int factorX, int factorY);
}