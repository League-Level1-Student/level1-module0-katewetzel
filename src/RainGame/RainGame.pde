int y = 0;
int score = 0;
int acceleration = 5;
int randomNumber = (int) random(width);
void setup(){
  size(600,600);
  background(017,187,255);
}

void draw(){
  background(017,187,255);
  fill(000,034,255);
  stroke(017,187,255);
  ellipse(randomNumber,y,20,50);
  y+=acceleration;
  if(y>=600){
    y=0;
    randomNumber = (int) random(width);
  }
  fill(204,017,000);
  rect(mouseX,520, 50, 80);
  fill(0, 0, 0);
textSize(16);
text("Score: " + score, 20, 20);
if(y==520){
  checkCatch(randomNumber);
  }
  }
  
  void checkCatch(int x){
     if (x > mouseX && x < mouseX+50)
          score++;
     else if (score > 0) 
          score--;
     println("Your score is now: " + score); }