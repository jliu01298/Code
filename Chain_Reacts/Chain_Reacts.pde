Ball[] balls;
void setup() {
  background(0);
  size(600, 600);
  balls=new Ball[30];
  for (int i=0; i<balls.length; i++) {
    balls[i]=new Ball();
  }
}
void draw() {
  clear();
  for (int i=0; i<balls.length; i++) {
    fill(balls[i].c);
    ellipse(balls[i].xCor+=balls[i].xSpeed, balls[i].yCor+=balls[i].ySpeed, balls[i].size, balls[i].size);
  }
  
}