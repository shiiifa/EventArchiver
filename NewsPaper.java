import java.util.Date;

public class NewsPaper implements canArchiveEvent, canGetInfo {
    private int id;
    private String title;
    private String eventName;
    private Date eventDate;
    private String eventLocation;
    private Date publishedDate;

    // Constructor
    public NewsPaper(int id, String title, String eventName, Date eventDate, String eventLocation, Date publishedDate) {
        this.id = id;
        this.title = title;
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.eventLocation = eventLocation;
        this.publishedDate = publishedDate;
    }

    // Getters
    public int getID() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getEventName() {
        return eventName;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public String getEventLocation() {
        return eventLocation;
    }

    public Date getPublishedDate() {
        return publishedDate;
    }

    // toString method
    @Override
    public String toString() {
        return "NewsPaper: \n" +
                "ID: " + id + "\n" +
                "Title: " + title + "\n" +
                "Event Name: " + eventName + "\n" +
                "Event Date: " + eventDate + "\n" +
                "Event Location: " + eventLocation + "\n" +
                "Published Date: " + publishedDate + "\n";
    }
}
