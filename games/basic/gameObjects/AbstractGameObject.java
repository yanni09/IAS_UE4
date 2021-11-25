package games.basic.gameObjects;

import games.basic.gameObjects.interfaces.GameObject;
import games.basic.position.interfaces.Positionable;

public class AbstractGameObject implements GameObject{

    private Positionable pos;
    
    public Positionable getPos() {
		return this.pos;
	}

    @Override
    public boolean isLeftOf(GameObject other) {
       if (other == null)
			return false;
		
		int pos = this.getPos().getX() + this.getWidth();
		return (pos < other.getPos().getX());
    }
    @Override
	public boolean isRightOf(GameObject other){
        if (other == null)
			return false;
		
		int pos = this.getPos().getX() + this.getWidth();
		return (pos > other.getPos().getX());
    }

    @Override
	public boolean isAboveOf(GameObject other) {
        if (other == null)
			return false;
		
		int pos = this.getPos().getY() + this.getHeight();
		return (pos < other.getPos().getY());
    }
	
    @Override
	public boolean isBelowOf(GameObject other) {
		if (other == null)
			return false;
		
		return other.isAboveOf(this);
    }
	
	public boolean touches(GameObject other) {
        if (other == null)
        return false;
    
    if (this.isLeftOf(other) || this.isRightOf(other) || this.isAboveOf(other) || this.isBelowOf(other)) {
        return false;
    } else {
        return true;
        }
    }
}
