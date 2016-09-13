
/**
 * Write a description of class LoopOne here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LoopOne
{
    int[] nums = new int[10];
    
    public LoopOne() 
    {
        
    }

    public void loadArray() 
    {
        int var = 0;
        for (int i = 0; i < 10; i++) 
        {
           var = (i+1)*5;
           nums[i] = var;
        }
    }
    
    public void printArray() 
    {
      for (int i = 0; i < 10; i++) 
        {
           System.out.print("" + nums[i]);
        }
    }
}
