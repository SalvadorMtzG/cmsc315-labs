import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Unit2PeekNextTicketTest {


    @Test
    @DisplayName("peekNextTicket on empty queue returns message and does not modify state")
    public void testPeekEmptyQueue() {
        Unit2Project app = new Unit2Project();

        String result = app.peekNextTicket();

        assertEquals("No tickets available.",
                result,
                "Should return message when queue is empty.");

        assertEquals(0,
                app.getPendingTicketCount(),
                "Queue should remain empty.");
    }

    @Test
    @DisplayName("peekNextTicket returns correct ticket and does not modify state when queue has one element")
    public void testPeekSingleTicket() {
        Unit2Project app = new Unit2Project();

        app.addTicket("Reset password");

        String result = app.peekNextTicket();

        assertEquals("Reset password",
                result,
                "Peek should return the only ticket in the queue.");

        assertEquals(1,
                app.getPendingTicketCount(),
                "Queue size should remain 1 after peek.");
    }


}