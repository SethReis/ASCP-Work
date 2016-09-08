
/**
 * Write a description of class BallRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BallRunner
{    
    private BallWorld ballWorld;
    private TGPoint entrancePoint;
    private BallBot[] ballBotArray;
    
    public static void activity1(){
       BallWorld ballWorld = new BallWorld(200, 200);
       TGPoint tGPoint = new TGPoint();
       BallBot bb = new BallBot(ballWorld, tGPoint, 0, 25);
       
       while (true) {
           if (bb.canMoveForward(ballWorld)) {
               bb.moveForward();
            }
            else{
                bb.setHeading(bb.getHeading()+90);
            }
        }
}
}
