
/**
 * Write a description of class SimpleCalc here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SimpleCalc
{
    private int numOne;
    private int numTwo;
    
    public SimpleCalc (int x, int y){
        numOne = x;
        numTwo = y;
    }
    
    public int add() {
        return numOne + numTwo;
    }
    
    public int subtract() {
        return numOne - numTwo;
    }
    
    public int mult() {
        return numOne * numTwo;
    }
    
    public int div() {
        return numOne / numTwo;
    }
    
    public boolean isGreater() {
         return numOne > numTwo;
        
    }
}

