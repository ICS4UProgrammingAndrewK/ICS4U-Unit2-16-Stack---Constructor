/**
 * Class stackTest
 */
 /**
*
* @author  Andrew Kuekam
* @version 1.0
* @since   2020-10-23 
*/
public class stackTest {
  public static void main(String[] args) {
    
    //creat the stack
    stackInt mystack = new stack();
    
    //this get the interger from the user
    for(int Interger = 0; Interger < 5; Interger++) {
      
    //push it onto the stack
    mystack.pushInt(Interger);
     
    //Pop it onto the stack
    mystack.PopInt(Interger);
      
    //Peek it onto the stack
    mystack.PeekInt(Interger);
    
    //clear it onto the stack
    mystack.ClearInt(Interger);
  }
}
