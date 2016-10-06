

int squareSize;
int numSquares = 100;
//Lab 9::CheckerBoard

void setup()
{
  size(800, 800);
  squareSize = width/numSquares;
  background(2);
  frameRate(2);
  for (int row = 0  ; row < numSquares ; row++ )
  {
    for(int col = 0  ; col < numSquares ; col++ )
    {
      //fill((col%2 == row%2)?color(255, 255, 40):color(110, 10, 220));
      // rect(row*blockSize, col*blockSize, blockSize, blockSize);
      if(col%2 == row%2){
        fill(color(255, 255, 0));
        rect(row*squareSize, col*squareSize, squareSize, squareSize);
      } else {
        fill(color(100, 10, 210));
        rect(row*squareSize, col*squareSize, squareSize, squareSize);
      }
    }
  }

}



