//Imports
import org.junit.Test; //For the test cases

import java.util.Date;

import static org.junit.Assert.assertEquals; //For comparison of data
import static org.junit.Assert.assertTrue;

// Creating the EventArchiverTest class
public class EventArchiverTest {

    @Test
    public void testEvent() {
        // Create an Event object
        Event event = new Event("Annual Gala", "City Hall", new Date(2024, 10, 15), "Cultural");

        // Verify the event details using getters
        assertEquals("Annual Gala", event.getEventName());
        assertEquals("City Hall", event.getEventLocation());
        assertEquals(new Date(2024, 10, 15), event.getEventDate());
        assertEquals("Cultural", event.getType());
    }

    @Test
    public void testGetters() {
        // Create an Event object
        Event event = new Event("Annual Gala", "City Hall", new Date(2024, 10, 15), "Cultural");

        // Verify that the getters return the expected values
        assertEquals("Annual Gala", event.getEventName());
        assertEquals("City Hall", event.getEventLocation());
        assertEquals(new Date(2024, 10, 15), event.getEventDate());
        assertEquals("Cultural", event.getType());
    }


    @Test
    public void testVideos(){
        Videos vid1 = new Videos(401, "VGMA 2023", new Date(2023, 6, 5), "National Theatre, Accra", "VGMA_Performance",
                new Date(2024, 7, 5), "mp4",400);

        assertEquals(401, vid1.getID());
        assertEquals("VGMA_Performance", vid1.getTitle());
        assertEquals("VGMA 2023", vid1.getEventName());
        assertEquals(new Date(2023, 06, 5), vid1.getEventDate());
        assertEquals("National Theatre, Accra", vid1.getEventLocation());
        assertEquals("mp4", vid1.getType());
        assertEquals(400, vid1.getNumberOfFrames());
    }

    @Test
    public void testMagazine(){
        Magazine mag1 = new Magazine(101, "AFCON Finals Coverage", "AFCON 2024 Final", new Date(124, 2, 30), "Baba Yara Sports Stadium, Ghana", new Date(124, 3, 2));
        assertEquals(101, mag1.getID());
        assertEquals("AFCON Finals Coverage", mag1.getTitle());
        assertEquals("AFCON 2024 Final", mag1.getEventName());
        assertEquals(new Date(124, 2, 30), mag1.getEventDate());
        assertEquals("Baba Yara Sports Stadium, Ghana", mag1.getEventLocation());
        assertEquals(new Date(124, 3, 2), mag1.getPublishedDate());

    }
    @Test
    public void testPictures(){
        Pictures pic1 = new Pictures(301, "VGMA 2023", new Date(2023, 5, 5), "National Theatre, Accra", "VGMA Event Highlights", new Date(2023, 5, 6), "Accra", "jpg");
        assertEquals(301, pic1.getID());
        assertEquals("VGMA Event Highlights", pic1.getTitle());
        assertEquals("VGMA 2023", pic1.getEventName());
        assertEquals(new Date(2023, 5, 5), pic1.getEventDate());
        assertEquals("National Theatre, Accra", pic1.getEventLocation());
        assertEquals(new Date(2023, 5, 6), pic1.getDatePosted());
        assertEquals("jpg", pic1.getType());

    }

    @Test
    public void testRelationships() {
        // Create instances of each class
        Videos vid1 = new Videos(401, "VGMA 2023", new Date(2023, 6, 5), "National Theatre, Accra", "VGMA_Performance",
                new Date(2024, 7, 5), "mp4", 400);
        Magazine mag1 = new Magazine(101, "AFCON Finals Coverage", "AFCON 2024 Final", new Date(124, 2, 30), "Baba Yara Sports Stadium, Ghana", new Date(124, 3, 2));
        Pictures pic1 = new Pictures(301, "VGMA 2023", new Date(2023, 5, 5), "National Theatre, Accra", "VGMA Event Highlights", new Date(2023, 5, 6), "Accra", "jpg");
        NewsPaper news1 = new NewsPaper(201, "Election Campaign Report",
                "Campaign Launch", new Date(2024, 6, 5),
                "Accra Sports Stadium", new Date(2024, 6, 6));
        Documents doc1 = new Documents(1, "Political Campaign Coverage", new Date(2024, 5, 7), "Accra Sports Stadium", "Political Campaign Coverage",
                new Date(2024, 5, 7), "pdf", "News Coverage");

        // Testing relationships between interfaces
        // vid1
        assertTrue(vid1 instanceof canGetInfo);
        assertTrue(vid1 instanceof canGetType);
        assertTrue(vid1 instanceof canArchiveEvent);

        // mag1
        assertTrue(mag1 instanceof canGetInfo);
        assertTrue(mag1 instanceof canArchiveEvent);

        // pic1
        assertTrue(pic1 instanceof canGetInfo);
        assertTrue(pic1 instanceof canGetType);
        assertTrue(pic1 instanceof canArchiveEvent);

        // news1
        assertTrue(news1 instanceof canGetInfo);
        assertTrue(news1 instanceof canArchiveEvent);

        assertTrue(doc1 instanceof canGetInfo);
        assertTrue(doc1 instanceof canArchiveEvent);
    }

    @Test
    public void testNewsPaper(){
        NewsPaper news1 = new NewsPaper(201, "Election Campaign Report",
                "Campaign Launch", new Date(2024, 6, 5),
                "Accra Sports Stadium", new Date(2024, 6, 6));
        assertEquals(201, news1.getID());
        assertEquals("Election Campaign Report", news1.getTitle());
        assertEquals("Campaign Launch", news1.getEventName());
        assertEquals(new Date(2024, 6, 5), news1.getEventDate());
        assertEquals("Accra Sports Stadium", news1.getEventLocation());
        assertEquals(new Date(2024, 6, 6), news1.getPublishedDate());
    }

    @Test
    public void testDocuments(){
        Documents doc1 = new Documents(1, "Political Campaign Coverage", new Date(2024, 5, 7), "Accra Sports Stadium", "Political Campaign Coverage",
                new Date(2024, 5,7), "pdf", "News Coverage");
        assertEquals(1, doc1.getID());
        assertEquals("Political Campaign Coverage", doc1.getTitle());
        assertEquals(new Date(2024, 5, 7), doc1.getEventDate());
        assertEquals("Accra Sports Stadium", doc1.getEventLocation());
        assertEquals("pdf", doc1.getType());
        assertEquals("News Coverage", doc1.getTypeName());
    }
}
