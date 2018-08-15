void setup(){
  size(1000,1000);
  background(153,187,255);
}

void draw(){
  background(153,187,255);
  int randomNumber = (int) random(width);
  int randomNumber2 = (int) random(width);
  getWormX(randomNumber);
  getWormY(randomNumber2);
  for(int i = 0;i<10;i++){
    fill(000,000,000);
    ellipse(randomNumber,randomNumber2,60,50);
   makeMagical();
  }
  if(mousePressed){
     fill(000,000,000);
     ellipse(randomNumber + 10,randomNumber-10,60,50);
  }
}
float frequency = .001;
float noiseInterval = PI;

void makeMagical() {
     fill( 0, 0, 0, 10 );
     rect(0, 0, width, height);
     noStroke();
}

float getWormX(int i) {
     return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
}

float getWormY(int i) {
     return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
}