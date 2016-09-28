
/**
 * Write a description of class LoopTwo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Arrays;
import java.util.Random;
public class StatLab2D
{
    int[][] nums2D = new int[3][3];
    public StatLab2D() 
    {
        
    }

    public void loadRandom2D() 
    {
        for(int row = 0; row < nums2D.length; row++){
            for(int col = 0; col < nums2D[row].length; col++){
                nums2D[row][col] = (int)(Math.random()*10+1);
            }
        }
    }
    
    public void printArray2D() 
    {
        for(int row = 0; row < nums2D.length; row++){
            for(int col = 0; col < nums2D[row].length; col++){
                System.out.print(nums2D[row][col] + "\t");
            }
            System.out.println();
        }
    }
    
    public void sortArray2D()
    {  
       int[] nums = new int[nums2D.length * nums2D[0].length];
       int i = 0;
       for(int row = 0; row < nums2D.length; row++){
            for(int col = 0; col < nums2D[row].length; col++){
                nums[i] = nums2D[row][col];
                i++;
            }
        }
       Arrays.sort(nums);
       i = 0;
       for(int row = 0; row < nums2D.length; row++){
            for(int col = 0; col < nums2D[row].length; col++){
                nums2D[row][col] = nums[i];
                i++;
            }
        }
    }
    
    public int findAverage2D()
    {
        int ave = 0;
        for(int row = 0; row < nums2D.length; row++){
            for(int col = 0; col < nums2D[row].length; col++){
                ave = ave + nums2D[row][col];
            }
        }
        ave = ave/(nums2D.length*nums2D[0].length);
        return ave;
    }
}
