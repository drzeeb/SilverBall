package zeeb.de.silverball;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

/**
 * Created by Michael on 22.02.2015.
 */
@Root
public class LevelPack {
    @Attribute
    private String name;
    @ElementList
    protected List<Level> levels;

    public String getName(){
        return name;
    }

    public List<Level> getLevels(){
        return levels;
    }

}
