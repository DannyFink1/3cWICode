package at.fda.games.movingObjects.objects;

import org.newdawn.slick.Graphics;

public class Oval
{
    private enum DIRECTION {RIGHT, LEFT};
    private float x;
    private float y;

    private DIRECTION objectDirection;
    private float speed;

    public Oval(float x, float y, float speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.objectDirection = DIRECTION.LEFT;
    }

    public void render(Graphics graphics){
        graphics.drawOval(this.x,this.y,70,30);
    }

    public void update(int delta){
        if(this.objectDirection == DIRECTION.LEFT){
            if(this.x < 600)
                this.x+=(float)delta/this.speed;
            else
                this.objectDirection = DIRECTION.RIGHT;
        }

        if(this.objectDirection == DIRECTION.RIGHT){
            if(this.x > 200)
                this.x-=(float)delta/this.speed;
            else
                this.objectDirection = DIRECTION.LEFT;
        }
    }
}
