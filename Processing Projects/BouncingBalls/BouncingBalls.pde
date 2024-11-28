Ball redball;

void setup() { // Happens once at launch
    size(1280, 720);
    background(200,200,200);
    redball = new Ball(200,200,50);
}

void draw() { // Happens constantly (screen refresh)
    background(200,200,200);
    redball.display();
    redball.move();

}

class Ball {
    int x, y, r;

    //Constructor
    Ball(int tempx, int tempy, int tempr) {
        x = tempx;
        y = tempy;
        r = tempr;
    }

    void display() {
        circle(x,y,r*2);
    }

    void move() {
        if (y <= height-r) {
            y++;
            x++;
        }
    }
}