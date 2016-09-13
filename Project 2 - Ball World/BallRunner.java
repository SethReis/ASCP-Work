
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
    
    public BallRunner(){
        BallWorld ballWorld = new BallWorld(500, 500);
        TGPoint entrancePoint = new TGPoint(0, 0);
        int ballBotArrayLength = 12;
    }
    
    public int findFreeBallBotIndex(){
        for (int i = 0; i < ballBotArray.length; i++){
            if(ballBotArray[i] == null){
                return 1;
            }
            else{
                return ballBotArray.length;
            }
        }
        return 0;
    }
    
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
