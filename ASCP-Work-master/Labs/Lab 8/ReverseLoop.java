
/**
 * Write a description of class ReverseLoop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ReverseLoop
{
    public ReverseLoop(){
        
    }
    
    public static void run(){
        ReverseLoop reverseLoop = new ReverseLoop();
        int[] nums = new int[6];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;
        nums[4] = 5;
        nums[5] = 6;
        int[] reverse = reverseLoop.reverseArray(nums);
        reverseLoop.printArray(nums, reverse);
    }

    public int[] reverseArray(int[] nums){
        int[] reverse = new int[nums.length];
        for(int i = 1; i <= nums.length; i++){
            reverse[reverse.length - i] = nums[i-1];
        }
        return reverse;
    }
    
    public void printArray(int[] nums, int[] reverse){
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + "\t");
        }
        System.out.println();
        for(int i = 0; i < reverse.length; i++){
            System.out.print(reverse[i] + "\t");
        }
    }
}
