package games.basic.position;
import games.basic.position.interfaces.*;

class Position implements Positionable {
       private int x;
       private int y;

       public Position(int x, int y)  {
           this.x = x;
           this.y = y;
       }
       
       public int getX() {
           return this.x;
       }

       public int getY() {
           return this.y;
        }
        
        public void setX(int x) {
            this.x = x;
        }
 
        public void setY(int y) {
            this.y = y;
        }

        public void move(Positionable shift) {
            this.x += shift.getX();
            this.y += shift.getY();
        }

        public void moveTo(Positionable pos){
            this.x = pos.getX();
            this.y = pos.getY();
        }

        public void scale(int factor) {
            this.x *= factor;
            this.y *= factor;
        }
        public void scale(int factorX, int factorY) {
            this.x *= factorX;
            this.y *= factorY;
        }

       @Override
       public String toString() {
        return "(" + this.getX() + ", " + this.getY() + ")";
       }

       public boolean equals(Position other) {
        if(other.getX() == this.getX() && other.getY() == this.getY()) {
            return true;
        } else {
            return false;
        } 
           }
}
