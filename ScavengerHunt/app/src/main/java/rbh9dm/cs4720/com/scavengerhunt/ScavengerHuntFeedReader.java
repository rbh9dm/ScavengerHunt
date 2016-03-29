package rbh9dm.cs4720.com.scavengerhunt;

import android.provider.BaseColumns;

/**
 * Created by Student User on 3/28/2016.
 */
public final class ScavengerHuntFeedReader {
    // To prevent someone from accidentally instantiating the contract class,
    // give it an empty constructor.
    public ScavengerHuntFeedReader() {}

    /* Inner class that defines the table contents */
    public static abstract class FeedEntry implements BaseColumns {
        public static final String TABLE_NAME = "ScavengerHunts";
        public static final String COLUMN_NAME_ENTRY_ID = "entryid";
        public static final String COLUMN_NAME_TITLE = "title";
    }
}
