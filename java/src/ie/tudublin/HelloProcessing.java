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
        drawTriangle(66.66, 20, 33.33, 80, 99.99, 80);
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
    
    float getPercentageCoord(int percentage, int num)
    {
        return (num / 100) * percentage;
    }// END getPercentageCoord()

    float drawTriangle(float x1, float y1, float x2, float y2, float x3, float y3)
}// END CLASS HelloProcessing
