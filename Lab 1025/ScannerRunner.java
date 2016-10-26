
/**
 * Write a description of class Scanner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class ScannerRunner
{
    /**
     * Constructor for objects of class Scanner
     */
    public ScannerRunner()
    {

    }

    public static void main(String[] args){
        String ans = "yes";
        int num = 0;
        Scanner scr = new Scanner("1 fish 2 fish red fish blue fish");
        num = scr.nextInt();
        System.out.print(num + "\n");
        ans = scr.next();
        System.out.print(ans + "\n");
        num = scr.nextInt();
        System.out.print(num + "\n");
        ans = scr.next();
        System.out.print(ans + "\n");
        ans = scr.next();
        System.out.print(ans + "\n");
        ans = scr.next();
        System.out.print(ans + "\n");
        ans = scr.next();
        System.out.print(ans + "\n");
        ans = scr.next();
        System.out.print(ans + "\n");
    }
}
