package at.fda.games.movingObjects;


import at.fda.games.movingObjects.objects.Circle;
import at.fda.games.movingObjects.objects.Oval;
import at.fda.games.movingObjects.objects.Rectangle;
import org.newdawn.slick.*;

public class MovingObjects extends BasicGame {

    private Rectangle rectangle;
    private Circle circle;
    private Oval oval;

    public MovingObjects(String title) {
        super(title);
    }
    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.rectangle = new Rectangle(100 ,100,2);
        this.circle = new Circle(50,100,2);
        this.oval = new Oval(50,50,2);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        this.rectangle.update(delta);
        this.circle.update(delta);
        this.oval.update(delta);
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        this.rectangle.render(graphics);
        this.circle.render(graphics);
        this.oval.render(graphics);
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new at.fda.games.movingObjects.MovingObjects("movingObjects"));
            container.setDisplayMode(800,800,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
