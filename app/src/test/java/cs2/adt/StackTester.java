package cs2.adt;

import static org.junit.jupiter.api.Assertions.*;

import java.util.EmptyStackException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StackTester {
  private Stack<Integer> stk;

  @BeforeEach
  public void init() {
    stk = new ArrayStack<Integer>();
  }

  @Test
  public void testSinglePushPop() {
    assertTrue(stk.isEmpty());
    stk.push(5);
    assertFalse(stk.isEmpty());
    assertEquals(stk.peek(), 5);
    assertEquals(stk.pop(), 5);
    assertTrue(stk.isEmpty());
  }

  @Test
  public void testMultiPushPop() {
    assertTrue(stk.isEmpty());
    for(int i=0; i<1000; i++) {
      stk.push(i);
      assertFalse(stk.isEmpty());
    }
    for(int i=999; i>=0; i--) {
      assertEquals(stk.peek(), i);
      assertEquals(stk.pop(), i);
    }
    assertTrue(stk.isEmpty());
  }

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



}
