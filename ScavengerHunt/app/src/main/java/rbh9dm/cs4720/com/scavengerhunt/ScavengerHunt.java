package rbh9dm.cs4720.com.scavengerhunt;

import java.util.ArrayList;

/**
 * Created by Student User on 3/30/2016.
 */
public class ScavengerHunt {
    private String name;

    public ScavengerHunt(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
