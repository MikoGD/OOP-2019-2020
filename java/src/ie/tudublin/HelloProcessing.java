package ie.tudublin;

import processing.core.PApplet;

public class HelloProcessing extends PApplet
{	
	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
	}

		
	int x = 0; // 4 bytes
	
	public void draw()
	{
		background(0, 255, 0);
		
        stroke(0, 0, 255);
		line(10, 10, 100, 100);	// x1, y1, x2, y2
		point(50, 50); // x, y
		fill(0, 255, 255);
		noStroke();
		ellipse(100, 200, 100, 50); // cx, cy, w, h
		fill(255, 0, 0);
		rect(70, 150, 90, 10); // tlx, tly, w, h
        triangle(150, 90, 200, 100, 100, 250);
		
	}
}
