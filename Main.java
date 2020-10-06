/**
 *For loop example
 * @author Zachary Balean 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //creates counting varibel
    System.out.println("Beginning to count!");
    int count = 1;
    //creates loop
    while(count <= 5){
      //print it
      System.out.println(count);
      //add one to count
      count = count + 1;
    } 
    System.out.println("That's all for now");
    
    //creates a for loop that counts to 5
    for(int count2 = 1; count2 <= 5; count2 = count2++){
      //print the number
      System.out.println(count2);
    }


  }
}
