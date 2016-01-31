package zeeb.de.silverball;

import org.simpleframework.xml.Attribute;

/**
 * Created by Michael on 22.02.2015.
 */
public class Hole {
    @Attribute
    private int x;
    @Attribute
    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
