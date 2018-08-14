int x = 0;
int acceleration = 5;
void setup(){
  size(600,600);
  background(153,187,255);
}

void draw(){
  background(153,187,255);
  fill(051,000,255);
  stroke(153,187,255);
  ellipse(x++,300,100,100);
  x+=acceleration;
  if(x>=600){
    x=600;
    x--;
    
    //#6
  }
}