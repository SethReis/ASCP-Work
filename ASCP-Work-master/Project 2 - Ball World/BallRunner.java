
/**
 * Write a description of class BallRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BallRunner
{    
    BallWorld ballWorld = new BallWorld(500, 500);
    TGPoint entrancePoint = new TGPoint(0,0);
    BallBot ballBotArray[] = new BallBot[12];//(ballWorld, entrancePoint, 0, 25)
   
    private double heading;
    
    public BallRunner(){
        BallWorld ballWorld = new BallWorld(500, 500);
        TGPoint entrancePoint = new TGPoint(0, 0);
        int ballBotArrayLength = 12;
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
                bb.setHeading((bb.getHeading()%360)+90);
            }
        }
    }
    
    public int findFreeBallBotIndex(){
        int get = 0;
        for(int i = 0; i < ballBotArray.length; i++){
            if(ballBotArray[i] == null){
                get = i;
            }
            else{
                get = ballBotArray.length;
            }
        }
        return get;
    } 
    
    public static void activity2() {
       BallWorld ballWorld = new BallWorld(200, 200);
    }
}
