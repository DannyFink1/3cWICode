package at.fda.games.movingObjects.objects;

import org.newdawn.slick.Graphics;

public class Rectangle {

    private enum DIRECTION {RIGHT,LEFT,UP,DOWN};
    private float x;
    private float y;

    private DIRECTION objectDirection;
    private float speed;

    public Rectangle(float x, float y, float speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.objectDirection = DIRECTION.RIGHT;
    }

    public void render(Graphics graphics){
        graphics.drawRect(this.x,this.y,100,100);
    }

    public void update(int delta){

        if(this.objectDirection == DIRECTION.RIGHT) {
            if (this.x < 500)
                this.x += (float) delta / this.speed;
            else
                this.objectDirection = DIRECTION.DOWN;


        }
        System.out.println(objectDirection);
        if(this.objectDirection == DIRECTION.DOWN) {

            if (this.y < 500)
                this.y += (float) delta / this.speed;
            else
                this.objectDirection = DIRECTION.LEFT;

        }

        if(this.objectDirection == DIRECTION.LEFT) {

            if (this.x > 200)
                this.x -= (float) delta / this.speed;
            else
                this.objectDirection = DIRECTION.UP;

        }

        if(this.objectDirection == DIRECTION.UP) {

            if (this.y > 200)
                this.y -= (float) delta / this.speed;
            else
                this.objectDirection = DIRECTION.RIGHT;

        }
    }
}
