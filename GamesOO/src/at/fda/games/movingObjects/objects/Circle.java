package at.fda.games.movingObjects.objects;

import org.newdawn.slick.Graphics;

public class Circle {

    private enum DIRECTION {UP,DOWN};
    private float x;
    private float y;

    private DIRECTION objectDirection;
    private float speed;

    public Circle(float x, float y, float speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.objectDirection = DIRECTION.DOWN;
    }

    public void render(Graphics graphics){
        graphics.drawOval(this.x,this.y,50,50);
    }

    public void update(int delta){
        if(this.objectDirection == DIRECTION.DOWN){
            if(this.y < 600)
                this.y+=(float)delta/this.speed;
            else
                this.objectDirection = DIRECTION.UP;
        }

        if(this.objectDirection == DIRECTION.UP){
            if(this.y > 200)
                this.y-=(float)delta/this.speed;
            else
                this.objectDirection = DIRECTION.DOWN;
        }
    }
}
