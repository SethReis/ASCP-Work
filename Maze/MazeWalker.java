
/**
 * Write a description of class MazeWalker here.
 *  
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MazeWalker
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class MazeWalker
     */
    public MazeWalker()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
    public void walkMaze(MazeBot mazeBot) {
      while(mazeBot.didNotReachGoal()) {
          if (mazeBot.canMoveForward()) {
              mazeBot.moveForward();
          }
          else{
              mazeBot.turnRight();
              if (mazeBot.canMoveForward()) {
                  mazeBot.moveForward();
              }
              else {
                  mazeBot.turnRight();
                  mazeBot.turnRight();
              }
          }
      }
        
        if (mazeBot.didReachGoal()) {
            mazeBot.signalSuccess();
            System.out.println("Congratulations");
        }
        
        else {
            mazeBot.signalError();
            System.out.println("Oh no!");
        }
    }
}
