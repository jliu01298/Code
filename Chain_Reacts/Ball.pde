class Ball {
  float r;
  float g;
  float b;
  float xSpeed;
  float ySpeed;
  float xCor;
  float yCor;
  float size;
  color c;
  Ball() {
    r=random(0, 255);
    g=random(0, 255);
    b=random(0, 255);
    xCor=random(200, 400);
    yCor=random(200, 400);
    size=random(25, 75);
    xSpeed=random(-10, 10);
    ySpeed=random(-10, 10);
    c=color(r,g,b);
    //fill(r, g, b);
    //ellipse(xCor, yCor, size, size);
  }
}