package cs2.adt;

public class NaiveArrayStack<T> implements Stack<T> {
  private T[] arr;

  public NaiveArrayStack() {
    arr = (T[]) new Object[0];
  }
  
  public void push(T elem) {
    T[] tmp = (T[]) new Object[arr.length + 1];
    for(int i=0; i<arr.length; i++) {
      tmp[i] = arr[i];
    }
    tmp[arr.length] = elem;
    arr = tmp;
  }
  public T pop() {
    T retVal = arr[arr.length-1];
    T[] tmp = (T[]) new Object[arr.length - 1];
    for(int i=0; i<tmp.length; i++) {
      tmp[i] = arr[i];
    }
    arr = tmp;
    return retVal;
  }
  public T peek() {
    return arr[arr.length-1];
  }
  public boolean isEmpty() {
    return arr.length == 0;
  }

  public static void main(String[] args) {
    Stack<Integer> stk = new NaiveArrayStack<Integer>();
    stk.push(1);
    stk.push(2);
    stk.push(3);
    while(!stk.isEmpty()) {
      System.out.println(stk.peek());
      System.out.println(stk.pop());
    }
  }
}
