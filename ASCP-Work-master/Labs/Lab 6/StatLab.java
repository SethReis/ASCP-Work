
/**
 * Write a description of class LoopTwo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Arrays;
import java.util.Random;
public class StatLab
{
    int[] nums = new int[10];
    public StatLab() 
    {
        
    }

    public void loadRandom() 
    {
        for(int i = 0; i < nums.length; i++){
            nums[i] = (int)(Math.random()*10+1);
        }
    }
    
    public void printArray() 
    {
        for(int i = 0; i < nums.length; i++){
                System.out.print("" + nums[i] + "\t");
        }
    }
    
     public void sortArray()
    {
        Arrays.sort(nums);
    }
    
    public int findAverage()
    {
        int ave = 0;
        for(int i = 0; i < nums.length; i++){
            ave = ave + nums[i];
        }
        ave = ave/10;
        return ave;
    }
    
    public double getMedian()
    {
        if(nums.length%2==0)
        {
            return (nums[nums.length/2] + nums[nums.length/2-1])/2;
        }
        else
        {
            return (nums[(nums.length/2)]);
        }
    }
}
