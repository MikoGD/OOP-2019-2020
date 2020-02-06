package ie.tudublin;

import processing.core.PApplet;

public class HelloProcessing extends PApplet
{	
    int length = 500;
    int width = 500;

	public void settings()
	{
		size(this.length, this.width);
	}// END settings()

	public void setup() {
	}// END setup()

		
	int x = 0; // 4 bytes
	
	public void draw()
	{
        background(237, 25, 9);
        drawTriangle((float)40, 20, (float)20, 80, (float)90, 80);
		/*
        stroke(0, 0, 255);
        line(10, 10, 100, 100);	// x1, y1, x2, y2
		point(50, 50); // x, y
		fill(0, 255, 255);
		noStroke();
		ellipse(100, 200, 100, 50); // cx, cy, w, h
		fill(255, 0, 0);
		rect(70, 150, 90, 10); // tlx, tly, w, h
        triangle(150, 90, 200, 100, 100, 250);
        */

    }// END draw()
    
    private float getPercentageCoord(float percentage, float num)
    {
        return (float) (num / 100) * percentage;
    }// END getPercentageCoord()

    private void drawTriangle(float x1, float y1, float x2, float y2, float x3, float y3)
    {
        float tx1, ty1, tx2, ty2, tx3, ty3;
    
        tx1 = getPercentageCoord(x1, this.width);
        ty1 = getPercentageCoord(y1, this.length);
        tx2 = getPercentageCoord(x2, this.width);
        ty2 = getPercentageCoord(y2, this.length);
        tx3 = getPercentageCoord(x3, this.width);
        ty3 = getPercentageCoord(y3, this.length);

        triangle(tx1, ty1, tx2, ty2, tx3, ty3);
    }// END drawTriangle()
}// END CLASS HelloProcessing
