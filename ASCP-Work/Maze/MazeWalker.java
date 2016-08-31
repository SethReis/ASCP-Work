
/**
 * Seth Reis
 * Maze Progect: Part 6
 */
public class MazeWalker
{
    // instance variables - replace the example below with your own
    public static void run()
    {
        Maze maze = new Maze();
        MazeWalker mazeWalker = new MazeWalker();
        mazeWalker.walkMaze(maze.getMazeBot());
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
