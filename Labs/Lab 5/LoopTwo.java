
/**
 * Write a description of class LoopTwo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LoopTwo
{
     int[] nums = new int[10];
    
    public LoopTwo() 
    {
        
    }

    public void loadRandom() 
    {
        int var = 0;
        for (int i = 0; i < 10; i++) 
        {
           var = (int) (Math.random()*10);
           nums[i] = var;
        }
    }
    
    public void sortArray()
    {
        //Ask questions about this
    }
    
    public void printArray() 
    {
      for (int i = 0; i < 10; i++) 
        {
           System.out.print("" + nums[i] + "\t");
        }
    }
    
    public string findAverage()
    {
        System.out.println("The average of these numbers is" +; //Ask a question here too
    }
}
