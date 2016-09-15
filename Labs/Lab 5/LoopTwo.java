
/**
 * Write a description of class LoopTwo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LoopTwo
{
    double total = new double;
    int[] nums = new int[10];
    
    public LoopTwo() 
    {
        
    }

    public void loadRandom() 
    {
        int var = 0;
        for (int i = 0; i < length; i++) 
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
      for (int i = 0; i < nums.length; i++) 
        {
           System.out.print("" + nums[i] + "\t");
        }
    }
    
    public void findAverage()
    {
        double total = 0.0
        for(int i = 0; i < nums.length; i++) {
           total = total + nums[i];
        }
        total = total / 10
        System.out.println("The average of these numbers is" + total; //Ask a question here too
    }
}
