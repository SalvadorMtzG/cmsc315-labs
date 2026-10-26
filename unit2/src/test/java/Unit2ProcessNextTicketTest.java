import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Unit2ProcessNextTicketTest {

    @Test
    @DisplayName("processNextTicket on empty queue returns message and leaves state unchanged")
    public void testProcessEmptyQueue() {
        Unit2Project app = new Unit2Project();

        String result = app.processNextTicket();

        assertEquals("No tickets to process.",
                result,
                "Should return message when queue is empty.");

        assertEquals(0,
                app.getPendingTicketCount(),
                "Queue should remain empty.");

        assertEquals(0,
                app.getActionHistorySize(),
                "Action stack should remain empty.");
    }

    @Test
    @DisplayName("processNextTicket processes one ticket correctly")
    public void testProcessSingleTicket() {
        Unit2Project app = new Unit2Project();

        app.addTicket("Reset password");

        String result = app.processNextTicket();

        assertEquals("Reset password",
                result,
                "Should return the processed ticket.");

        assertEquals(0,
                app.getPendingTicketCount(),
                "Queue should be empty after processing one ticket.");

        assertEquals(1,
                app.getActionHistorySize(),
                "Action stack should contain one entry.");
    }

    @Test
    @DisplayName("processNextTicket processes multiple tickets in FIFO order")
    public void testProcessMultipleTickets() {
        Unit2Project app = new Unit2Project();

        app.addTicket("Ticket A");
        app.addTicket("Ticket B");
        app.addTicket("Ticket C");

        assertEquals("Ticket A", app.processNextTicket(),
                "First processed ticket should be Ticket A.");

        assertEquals("Ticket B", app.processNextTicket(),
                "Second processed ticket should be Ticket B.");

        assertEquals("Ticket C", app.processNextTicket(),
                "Third processed ticket should be Ticket C.");

        assertEquals(0,
                app.getPendingTicketCount(),
                "Queue should be empty after all processing.");

        assertEquals(3,
                app.getActionHistorySize(),
                "Action stack should contain three processed actions.");
    }

}