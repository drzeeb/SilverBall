package zeeb.de.silverball;

import org.simpleframework.xml.Attribute;

/**
 * Created by Michael on 22.02.2015.
 */
public class Obstacle {
    @Attribute
    private String type;
    @Attribute
    private int x;
    @Attribute
    private int y;
    @Attribute
    private int w;
    @Attribute
    private int h;

    public String getType() {
        return type;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getW() {
        return w;
    }

    public int getH() {
        return h;
    }
}
