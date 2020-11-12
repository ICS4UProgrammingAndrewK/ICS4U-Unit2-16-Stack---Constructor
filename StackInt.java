import java.util.*;
/**

* Class MyIntStack

* @author  Andrew Kuekam
* @version 1.0
* @since   2020-10-23 
*/
public class StackInt {
    /**
    * .
    */
    //private properties
    private Stack<Integer> stack;
    /**
    * .
    */    
    // constuctor
    public StackInt() {
      // This create an  empty stack of integers
      stack = new Stack<Integer>();
    }
    /**
    * .
    */
    //create a public stacksize
    public int Stacksize() {
      // Creating an empty Stack 
      int size = stack.size();
      //this return the size
      return size;
    }
    /**
    * .
    */
    //This create a public push
    public int pushInt(int number) {
      //return the push number in the stack
      return stack.push(number);
    }
    /**
    * .
    */
    //This create the public Pop
    public int PopInt() {
      //user number to stackPop
      int number = stack.pop();
      //This return the number from the top of the stack
      return number;
    }
    /**
    * .
    */
    //This create the public Peek
    public int PeekInt() {
      //user number to the stackpeek
      int number = stack.peek();
      //return the number peeked
      return number;
    }
    /**
    * .
    */
    //this create the public clear
    public void ClearInt() {
      stack.removeAllElements();
      
    }
}