
# Unit 2 Lab: Support Desk Simulator

In this lab, you will create a support desk simulator that models:

- **Queue behavior** for incoming service tickets  
- **Stack behavior** for action history and undo tracking  

---

## Learning Goals

By completing this lab, you will:

- Practice **FIFO (First-In, First-Out)** and **LIFO (Last-In, First-Out)** behavior  
- Implement **add**, **remove**, and **peek**-style workflows  
- Explain where stacks and queues appear in real systems  
- Create and run **JUnit** test methods  

---

## Lab Setup (IntelliJ)

Open IntelliJ IDEA and select **File → Open**. Navigate to the provided lab project folder and open it. Allow IntelliJ to import and index the project, then open `Unit2Project.java` to begin working. Run the provided JUnit test classes to verify your implementation.

---

## Required Development Workflow

For each method, you should follow this workflow:

1. Implement ONE method in **Unit2Project** 
   - Example: `addTicket`
2. Immediately run the matching JUnit test class  
   - Example: **Unit2AddTicketTest**
3. Fix any errors until all tests pass
4. Then repeat for the next method

You should complete the lab in order and test after each method. 

---

## TASK #1: Implement methods in Unit2Project

Edit the **Unit2Project** class to implement the following methods:

- addTicket
- peekNextTicket
- processNextTicket
- undoLastAction

Follow the required workflow for each method:

- Implement method → Run JUnit test → Confirm All Tests Pass (Fix Errors as Needed) → Move to next method

JUnit test classes:

- Unit2AddTicketTest
- Unit2PeekNextTicketTest
- Unit2ProcessNextTicketTest
- Unit2UndoLastActionTest

---

## TASK #2: Add a new JUnit test method

Edit the Unit2PeekNextTicketTest class and add a new test method named:

**testPeekMultipleTickets**

### Your test should:

- Add **three tickets** to the queue  
- Call **peekNextTicket**  
- Use assertions to verify:
  - The value returned by **peekNextTicket**  
  - The size of the queue after peeking  
- Include comments explaining each step of the test  

---

## TASK #3: Reflection Essay

Create a **Word document or PDF** that reflects on your experience with this lab. Your reflection should address the following:

- Explain why **stacks** and **queues** behave differently  
- Describe your implementation choices in **Unit2Project**` 
- Reflect on which method was easier or harder to implement, and why  
- Describe how you implemented **testPeekMultipleTickets**. 

Include:

- A copy of your **testPeekMultipleTickets** method code  
- A screenshot showing the test running successfully  

---

## Submission Instructions

1. Submit your **reflection essay** (Word or PDF) to the **LEO/D2L Unit 2 Lab**  
2. Submit Unit2Project.java to the **zyBooks Unit 2 Lab**.  Confirm the tests pass in zyBooks.
