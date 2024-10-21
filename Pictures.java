import java.util.Date;

public class Pictures implements canGetType, canGetInfo, canArchiveEvent {
    private int id;
    private String eventName;
    private Date eventDate;
    private String eventLocation;
    private String title;
    private Date datePosted;
    private String location;
    private String type;

    // Constructor
    public Pictures(int id, String eventName, Date eventDate, String eventLocation, String title, Date datePosted, String location, String type) {
        this.id = id;
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.eventLocation = eventLocation;
        this.title = title;
        this.datePosted = datePosted;
        this.location = location;
        this.type = type;
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

    public String getLocation() {
        return location;
    }

    public Date getDatePosted() {
        return datePosted;
    }

    public String getType() {
        return type;
    }

    // toString Method
    @Override
    public String toString() {
        return "Picture Details: \n" +
                "ID: " + id + "\n" +
                "Event Name: " + eventName + "\n" +
                "Event Date: " + eventDate + "\n" +
                "Event Location: " + eventLocation + "\n" +
                "Title: " + title + "\n" +
                "Date Posted: " + datePosted + "\n" +
                "Location: " + location + "\n" +
                "Type: " + type + "\n";
    }
}
