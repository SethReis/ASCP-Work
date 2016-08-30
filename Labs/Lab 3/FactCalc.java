
/**
 * Write a description of class FactCalc here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FactCalc
{
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
