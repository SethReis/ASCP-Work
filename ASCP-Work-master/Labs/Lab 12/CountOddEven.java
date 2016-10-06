
/**
 * Write a description of class CountOddEven here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CountOddEven
{
    private int[][] nums2D = new int[5][3];
    private int odds = 0;
    private int evens = 0;
    public CountOddEven()
    {

    }

    public void loadArray()
    {
         for(int row = 0; row < nums2D.length; row++){
            for(int col = 0; col < nums2D[row].length; col++){
                nums2D[row][col] = (int)(Math.random()*15+1);
            }
        }
    }
    
    public void countEvensAndOdds()
    {
         for(int row = 0; row < nums2D.length; row++){
            for(int col = 0; col < nums2D[row].length; col++){
                if(nums2D[row][col]%2 == 0)
                {
                    evens = evens + 1;
                }
                else{
                    odds = odds + 1;
                }
            }
        }
    }
    
    public int getOdds()
    {
        return odds;
    }
    
    public int getEvens()
    {
        return evens;
    }
    
    public void printResults()
    {
        System.out.print("Odds: " + odds + "\t Evens: " + evens);
    }
}
