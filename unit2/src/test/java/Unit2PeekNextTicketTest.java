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
    /*
        1. I created an object named 'app'
        2. I added three tickets to the queue
        3. I peeked into the queue calling peekNextTicket() and saved the result in 'result'
        4. I test to make sure peek returns the first value in the queue
        5. I test to verify the queue still has three elements
        6. I processed a ticket
        7. I repeated steps 3-6 two more times to check all tickets
     */
    @Test
    @DisplayName("peekNextMultipleTickets returns correct ticket and does not modify state when queue has one element")
    public void testPeekMultipleTickets() {

        Unit2Project app = new Unit2Project();

        app.addTicket("Reset password");
        app.addTicket("Install printer");
        app.addTicket("Update software");

        String result = app.peekNextTicket();

        assertEquals("Reset password",
                result,
                "Peek should return the first ticket in the queue.");

        assertEquals(3,
                app.getPendingTicketCount(),
                "Queue size should be 2 after peek.");

        app.processNextTicket();
        result = app.peekNextTicket();

        assertEquals("Install printer",
                result,
                "Peek should return the first ticket in the queue after calling processNextTicket().");

        assertEquals(2,
                app.getPendingTicketCount(),
                "Queue size should remain 3 after peek.");

        app.processNextTicket();
        result = app.peekNextTicket();

        assertEquals("Update software",
                result,
                "Peek should return the first ticket in the queue after calling processNextTicket().");

        assertEquals(1,
                app.getPendingTicketCount(),
                "Queue size should be 1 after peek.");

    }


}