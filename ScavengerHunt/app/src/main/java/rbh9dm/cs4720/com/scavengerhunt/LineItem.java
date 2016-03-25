package rbh9dm.cs4720.com.scavengerhunt;

/**
 * Created by Student User on 3/23/2016.
 */
public class LineItem {
    private String name;
    private String description;
    private boolean pictureRequired;
    private boolean locationRequired;

    public LineItem(String name, String description, boolean pictureRequired, boolean locationRequired) {
        this.name = name;
        this.description = description;
        this.pictureRequired = pictureRequired;
        this.locationRequired= locationRequired;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString() {
        return name;
    }

    public boolean isPictureRequired() {
        return pictureRequired;
    }

    public void setPictureRequired(boolean pictureRequired) {
        this.pictureRequired = pictureRequired;
    }

    public boolean isLocationRequired() {
        return locationRequired;
    }

    public void setLocationRequired(boolean locationRequired) {
        this.locationRequired = locationRequired;
    }
}
