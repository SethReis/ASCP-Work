
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
    
    //ballWorld = new BallWorld(900, 900);
    //entrancePoint = new TGPoint(0, 0);
    //int ballBotArrayLength = 6;
    //BallBot[] ballBotArray = new BallBot[6];
    
    public BallRunner(BallWorld bw, TGPoint tgp, int length) {
        ballWorld = bw;
        entrancePoint = tgp;
        ballBotArray = new BallBot[length];
    }
    
    private int findFreeBallBotIndex() {
        for(int i = 0; i < ballBotArray.length; i++) {
            if(ballBotArray[i] == null) {
                return i;
            }
        }
        return -1; // I'm supposed to return "ballBotArray.length" here but -1 seems more intuitive.
    }
    
    private double distanceBetweenPoints(TGPoint point1, TGPoint point2) {
        double xdiff = (point1.x - point2.x) * (point1.x - point2.x);
        double ydiff = (point1.y - point2.y) * (point1.y - point2.y);
        return Math.sqrt(xdiff + ydiff);
    }
    
    private boolean entranceClear(int radius) {
        for(int i = 0; i < ballBotArray.length; i++) {
            if (ballBotArray[i] == null) {
                continue;
            }
            double distance = distanceBetweenPoints(entrancePoint, ballBotArray[i].getPoint());
            if (distance < 1.1 * (radius + ballBotArray[i].getRadius())) {
                return false;
            }
            // else keep looking
        }
        return true;
    }
    
    private BallBot ballBotToBounceOff(BallBot ballBot) {
        TGPoint firstPoint = ballBot.getPoint();
        TGPoint nextPoint = ballBot.forwardPoint();
        boolean C1 = false;
        boolean C2 = false;
        
        for(int i = 0; i < ballBotArray.length; i++) {
            BallBot otherBot = ballBotArray[i];
            if(otherBot != null && otherBot != ballBot) {
                double currentDistance = distanceBetweenPoints(firstPoint, otherBot.getPoint());
                if(currentDistance <= ballBot.getRadius() + otherBot.getRadius()) {
                    C1 = true;
                }
                double nextDistance = distanceBetweenPoints(nextPoint, otherBot.getPoint());
                if(nextDistance <= currentDistance) {
                    C2 = true;
                }
                if(C1 && C2) {
                    return otherBot;
                }
            }
        }
        return null;
    }
    
    public static void run() {
        BallWorld ballWorld = new BallWorld(1800, 1000);
        BallRunner ballRunner = new BallRunner(ballWorld, new TGPoint(0, 0), 50);
        ballRunner.mainLoop();
    }
    
    public void mainLoop() {
        int radius = (int) (Math.random() * (Math.random() * 90)) + 1;
        while(true) {
            if(entranceClear(radius)) {
                int freeIndex = findFreeBallBotIndex();
                if(freeIndex >= 0) {
                    BallBot newBot = new BallBot(ballWorld, entrancePoint, Math.random() * 360, radius);
                    newBot.setColor((int) (Math.random() * 31));
                    newBot.setPixelsPerSecond((int) ((Math.random() * 120) / radius*10-1) + 30);
                    ballBotArray[freeIndex] = newBot;
                    radius = (int) (Math.random() * (Math.random() * 90)) + 1;
                }
            }
            for(int i = 0; i < ballBotArray.length; i++) {
                if(ballBotArray[i] != null) {
                    BallBot bouncingBot = ballBotToBounceOff(ballBotArray[i]);
                    if(ballBotArray[i].canMoveForward(ballWorld) && bouncingBot == null) {
                        ballBotArray[i].moveForward();
                    } else if(bouncingBot != null) {
                        ballBotArray[i].setHeading(ballBotArray[i].getHeading() + 180);
                        ballBotArray[i].moveForward();
                    } else {
                        ballBotArray[i].setHeading(Math.random() * 360);
                    }
                }
            }
        }
    }
}
