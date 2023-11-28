package cs2.adt;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class QueueTester {
  private Queue<Integer> q;

  @BeforeEach
  public void init() {
    q = new LinkedQueue<Integer>();
  }

  @Test
  public void testSingleEnDeQ() {
    assertTrue(q.isEmpty());
    q.enqueue(5);
    assertFalse(q.isEmpty());
    assertEquals(q.peek(), 5);
    assertEquals(q.dequeue(), 5);
    assertTrue(q.isEmpty());
  }

  @Test
  public void testMultiEnDeQ() {
    assertTrue(q.isEmpty());
    for(int i=0; i<1000; i++) {
      q.enqueue(i);
      assertFalse(q.isEmpty());
    }
    for(int i=0; i<1000; i++) {
      assertEquals(q.peek(), i);
      assertEquals(q.dequeue(), i);
    }
    assertTrue(q.isEmpty());
  }

  /*
  @Test
  public void testExceptions() {
    try {
      stk.pop();
      //assertTrue(false);
      fail("EmptyStackException not thrown");
    }
    catch(EmptyStackException e) {
      assertTrue(true);
    }
    catch(Exception e) {
      fail("Wrong kind of exception");
    }

    try {
      stk.push(5);
      stk.pop();
    }
    catch(EmptyStackException e) {
      fail("Exception thrown on non-empty stack");
    }


  }
  */

}
