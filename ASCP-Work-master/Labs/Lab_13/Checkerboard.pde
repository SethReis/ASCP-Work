

int squareSize;
int numSquares = 200;
//Lab 13::ColorLab

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
      if(col%2 == row%2){
        fill(color(row, row*2, 0));
        rect(row*squareSize, col*squareSize, squareSize, squareSize);
      } else {
        fill(color(100, col, col*2));
        rect(row*squareSize, col*squareSize, squareSize, squareSize);
      }
    }
  }

}



