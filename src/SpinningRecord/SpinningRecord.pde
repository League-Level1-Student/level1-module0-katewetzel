import ddf.minim.*;
Minim minim;
AudioPlayer song;
PImage pictureOfRecord;
int x = 0;

void setup(){
  size(600,600);
  pictureOfRecord= loadImage("download.jpg");
  pictureOfRecord.resize(600,600);
  minim = new Minim(this);
  song = minim.loadFile("awesomeTrack.mp3",512);
  if(mousePressed){
  song.play();
}
}

void draw(){
  background(pictureOfRecord);
 x++;
 if(mousePressed){
  rotateImage(pictureOfRecord,x);
    image(pictureOfRecord, 0, 0);
}
}

void rotateImage(PImage image, int amountToRotate) {
     translate(width/2, height/2);
     rotate(amountToRotate*TWO_PI/360);
     translate(-image.width/2, -image.height/2);
}