
/**
 * Write a description of class COErunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class COErunner
{
    public static void main(String[] args)
    {
        CountOddEven coe = new CountOddEven();
        coe.loadArray();
        coe.countEvensAndOdds();
        coe.getOdds();
        coe.getEvens();
        coe.printResults();
    }
}
