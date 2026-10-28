import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Unit2UndoLastActionTest {

    @Test
    @DisplayName("undoLastAction on empty stack returns message and leaves state unchanged")
    public void testUndoEmptyStack() {
        Unit2Project app = new Unit2Project();

        String result = app.undoLastAction();

        assertEquals("No actions to undo.",
                result,
                "Should return message when action stack is empty.");

        assertEquals(0,
                app.getActionHistorySize(),
                "Action stack should remain empty.");
    }

    @Test
    @DisplayName("undoLastAction removes and returns the most recent action (single item)")
    public void testUndoSingleAction() {
        Unit2Project app = new Unit2Project();

        app.addTicket("Reset password");
        app.processNextTicket();

        String result = app.undoLastAction();

        assertEquals("Processed ticket: Reset password",
                result,
                "Should return the most recent processed action.");

        assertEquals(0,
                app.getActionHistorySize(),
                "Action stack should be empty after undo.");
    }

    @Test
    @DisplayName("undoLastAction follows LIFO order for multiple actions")
    public void testUndoMultipleActionsLIFO() {
        Unit2Project app = new Unit2Project();

        app.addTicket("Ticket A");
        app.addTicket("Ticket B");
        app.addTicket("Ticket C");

        app.processNextTicket(); // A
        app.processNextTicket(); // B
        app.processNextTicket(); // C

        // Undo last in (C), should come out first
        assertEquals("Processed ticket: Ticket C",
                app.undoLastAction(),
                "First undo should return Ticket C action.");

        // Next undo (B)
        assertEquals("Processed ticket: Ticket B",
                app.undoLastAction(),
                "Second undo should return Ticket B action.");

        // Next undo (A)
        assertEquals("Processed ticket: Ticket A",
                app.undoLastAction(),
                "Third undo should return Ticket A action.");

        assertEquals(0,
                app.getActionHistorySize(),
                "Action stack should be empty after all undos.");
    }

}