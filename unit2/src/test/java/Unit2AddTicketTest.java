import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Unit2AddTicketTest {

    @Test
    @DisplayName("addTicket adds a single valid ticket")
    public void testAddSingleTicket() {
        Unit2Project app = new Unit2Project();

        app.addTicket("Reset password");

        assertEquals(1, app.getPendingTicketCount(),
                "Queue size should be 1 after adding one ticket.");
    }

    @Test
    @DisplayName("addTicket correctly adds multiple tickets")
    public void testAddMultipleTickets() {
        Unit2Project app = new Unit2Project();

        app.addTicket("Reset password");
        app.addTicket("Install printer");
        app.addTicket("Update software");

        assertEquals(3, app.getPendingTicketCount(),
                "Queue size should be 3 after adding three tickets.");
    }

    @Test
    @DisplayName("addTicket throws exception for null ticket")
    public void testAddNullTicket() {
        Unit2Project app = new Unit2Project();

        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> app.addTicket(null),
                "Adding a null ticket should throw IllegalArgumentException.");

        assertEquals("Ticket cannot be null or empty.",
                exception.getMessage(),
                "Exception message should match expected validation message.");
    }

    @Test
    @DisplayName("addTicket throws exception for empty ticket")
    public void testAddEmptyTicket() {
        Unit2Project app = new Unit2Project();

        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> app.addTicket(""),
                "Adding an empty ticket should throw IllegalArgumentException.");

        assertEquals("Ticket cannot be null or empty.",
                exception.getMessage(),
                "Exception message should match expected validation message.");
    }

}