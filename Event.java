import java.util.Date;

public class Event implements canArchiveEvent, canGetType {
    private String name;
    private String location;
    private Date date;
    private String type; // Event type (e.g., "Cultural", "Political", etc.)

    // Constructor
    public Event(String eventName, String eventLocation, Date eventDate, String type) {
        this.name = eventName;
        this.location = eventLocation;
        this.date = eventDate;
        this.type = type;
    }

    // Getters for the Event class
    @Override
    public String getEventName() {
        return name;
    }

    @Override
    public String getEventLocation() {
        return location;
    }

    @Override
    public Date getEventDate() {
        return date;
    }

    @Override
    public String getType() {
        return type;
    }

    // toString method
    @Override
    public String toString() {
        return "Event: \n" +
                "Event Name: " + name + "\n" +
                "Event Location: " + location + "\n" +
                "Event Date: " + date + "\n" +
                "Type: " + type + "\n";
    }
}