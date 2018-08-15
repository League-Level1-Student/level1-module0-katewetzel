import ddf.minim.*;
Minim minim;
AudioSample sound;
int x = 0;
int y = 0;
int randomNumber = (int) random(width);
int acceleration = 3;
int yacceleration = 5;
void setup(){
  size(600,600);
  background(153,187,255);
  minim = new Minim(this);
}

void draw(){
  background(153,187,255);
  fill(255,000,155);
  rect(mouseX,580,50,20);
  fill(051,000,255);
  stroke(153,187,255);
  ellipse(randomNumber,y++,50,50);
  x+=acceleration;
  y+=yacceleration;
  if(x>=600){
    acceleration = -acceleration;
  }
  if(x<=0){
    acceleration = -acceleration;
}
if(y>=600){
  yacceleration = -yacceleration;
}
if(y<=0){
  yacceleration = -yacceleration;
}
intersects(randomNumber,y,mouseX,580,50);
}

boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength) {
     if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength)
          return true;
     else 
          return false;
}