
/**
 * Write a description of class LoopTwoRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StatLabRunner
{
    public static void main () 
    {
       StatLab statLab = new StatLab();
       statLab.loadRandom();
       statLab.sortArray();
       statLab.printArray();
       System.out.println("\n" + statLab.findAverage());
       System.out.println("\n" + statLab.getMedian());
    }
}
