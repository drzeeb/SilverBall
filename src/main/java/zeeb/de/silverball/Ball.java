package zeeb.de.silverball;

import org.simpleframework.xml.Attribute;

/**
 * Created by Michael on 22.02.2015.
 */
public class Ball {
    @Attribute
    private int startx;
    @Attribute
    private int starty;

    public int getStartx() {
        return startx;
    }

    public int getStarty() {
        return starty;
    }
}
