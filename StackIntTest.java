import java.util.Scanner;
import java.util.*;
/**
* Class stackTest
*/
/**
*
* @author  Andrew Kuekam
* @version 1.0
* @since   2020-10-23 
*/
public class StackIntTest {
  public static void main(String[] args) {
    
    //creat the stack
    StackInt mystack = new StackInt();
    
    // let user input
    Scanner userInput = new Scanner(System.in);
    
    //This print how it works
    System.out.println("In a stack, all operation takes place at the TOP of the stack . ");
    System.out.println("The PUSH operation adds an item to the of the stack. ");
    System.out.println("The POP operation remove the item on the top of the stack and retuns it:");
    System.out.println("");
    
    System.out.println("Enter 1 for PUSH:");
    System.out.println("Enter 2 for POP:");
    System.out.println("Enter 3 PEEK:");
    System.out.println("Enter 4 CLEAR");
    System.out.println("==============================");
    System.out.println(" ");
    
    
    // bool true
    boolean running = true; 
    while (running) {
      
      int number = userInput.nextInt();
      
      //push it onto the stack
      if (number == 1 ) { 
        
        // ask number 
        System.out.println(" Enter an Integer");
        
        int userPush = userInput.nextInt();
        
        //call method
        mystack.pushInt(userPush);
        
        // printy
        System.out.println(userPush + " has been pushed to stack");
        System.out.println("==============================");
        System.out.println(" ");
        
        // for Pop
      } else if (number == 2) {
        
        //call size
        int size = mystack.Stacksize();
        if (size == 0)  {
          //This prints the stack is emty.
          System.out.println(" Error. Stack empty");
          System.out.println("=============================");
          System.out.println(" ");
          
        } else  {
          //call stacksize method
          int poppedInt = mystack.PopInt();
          System.out.println(poppedInt + " is Poped");
          System.out.println("=============================");
          System.out.println(" ");
          
          }
      } else if (number == 3) {
          int PeekingInt = mystack.PeekInt();
          System.out.println(PeekingInt + " is at the top of the stark");
          System.out.println("=============================");
          System.out.println(" ");
          
          //
          int size = mystack.Stacksize();
          if (size == 0) {
            //This prints the stack is emty.
            System.out.println(" Error. Stack empty");
            System.out.println("=============================");
            System.out.println(" ");
          }
          
      } else if (number == 4) {
        //
        int ClearingInt = mystack.ClearInt();
        System.out.println(ClearingInt + " is Clear from the stark");
        System.out.println("=============================");
        System.out.println(" ");
        
        //
        int size = mystack.Stacksize();
        if (size == 0) {
          //This prints the stack is emty.
          System.out.println(" Error. Stack empty");
          System.out.println("=============================");
          System.out.println(" ");
        }
          
      } else { 
        System.out.println("Enter a valid number");
        System.out.println("1 to PUSH:");
        System.out.println("2 to for POP:");
        System.out.println("3 to PEEK:");
        System.out.println("4 to CLEAR");
      }
    }
  }
}
