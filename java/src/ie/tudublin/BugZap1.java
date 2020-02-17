package ie.tudublin;

import processing.core.PApplet;

public class BugZap1 extends PApplet
{

    private class Bullet
    {
        float bulletHeight;
        float bulletX, bulletY;
        int bulletSpeed;

        public Bullet(float x, float y, int speed)
        {
            this.bulletHeight = x + 10;
            this.bulletX = x;
            this.bulletY = y;
            this.bulletSpeed = speed;
            this.drawBullet(this.bulletX, this.bulletY);
        }// END Bullet()

        public void drawBullet(float x, float y)
        {
            stroke(255);
            line(x, y - this.bulletHeight, x, y - this.bulletHeight);
        }// END drawBullet()

        public void moveBullet()
        {
            this.bulletY += this.bulletSpeed;
            drawBullet(this.bulletX, this.bulletY);
        }// END moveBullet()
    }// END CLASS Bullet

    float playerX, playerY;
    float playerHeight, playerWidth, halfPlayerHeight, halfPlayerWidth;

    public void settings()
    {
        size(500, 500);
    }// END settings()

    public void setup()
    {
        this.reset();
        this.playerHeight = 50;
        this.playerWidth = this.playerHeight / 2;
        this.halfPlayerHeight = this.playerHeight / 2;
        this.halfPlayerWidth = this.playerWidth / 2;
    }// END setup()

    public void reset()
    {
        this.playerX = width / 2;
        this.playerY = height - 50;
    }// END reset()

    public void drawPlayer(float x, float y, float width)
    {
        stroke(255);
        fill(255);
        triangle(
            x - this.halfPlayerWidth, 
            y + this.halfPlayerHeight, 
            x, 
            y, 
            x,
            y + this.halfPlayerHeight * .8f);

        stroke(255);
        fill(255);
        triangle(
            x, 
            y + this.halfPlayerHeight * .8f, 
            x, 
            y, 
            x + this.halfPlayerWidth,
            y + this.halfPlayerHeight);
    }// END drawPlayer()

    public void drawBullet(float x, float y)
    {
        stroke(255);
        line(x, y, x + 50, y + 50);
    }

    public void keyPressed()
    {
        if (keyCode == LEFT)
        {
            this.playerX -= 4;
        }
        else if (keyCode == RIGHT)
        {
            this.playerX += 4;
        }
        else if (keyCode == ' ')
        {
            Bullet bullet1 = new Bullet(this.playerX, this.playerY, 10);
        }// END IF
    }// END keyPressed()

    public void draw()
    {
        background(25);
        this.drawPlayer(playerX, playerY, playerWidth);
    }// END draw()
}// END CLASS BugZap1