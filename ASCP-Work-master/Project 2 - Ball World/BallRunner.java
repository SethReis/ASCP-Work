
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
    BallBot ballBotArray[];//(ballWorld, entrancePoint, 0, 25)
    
    public BallRunner(BallWorld bw, TGPoint tgp, int length){
        ballWorld = bw;
        entrancePoint = tgp;
        BallBot ballBotArray[] = new BallBot[length];
    }
    
    private int findFreeBallBotIndex(){
        for(int i = 0; i < ballBotArray.length; i++){
            if(ballBotArray[i] == null){
                return i;
            }
        }
        return ballBotArray.length;
    } 
    
    public static void activity2(){
       BallWorld ballWorld = new BallWorld(500, 500);
       BallRunner br = new BallRunner(ballWorld, new TGPoint(0, 0), 12);
       br.loop();
    }
    
    public void loop() {
       while(findFreeBallBotIndex() < ballBotArray.length) {
           ballBotArray[findFreeBallBotIndex()] = new BallBot(ballWorld, entrancePoint, 0, 25);
      }
       
       for(int i = 0; i < ballBotArray.length; i++) {
           if (ballBotArray[i] != null && ballBotArray[i].canMoveForward(ballWorld)) {
               ballBotArray[i].moveForward();
           }
           else{
                ballBotArray[i].setHeading((ballBotArray[i].getHeading()%360)+90);
           }
       }
    }
}
