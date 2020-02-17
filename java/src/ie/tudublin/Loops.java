package ie.tudublin;

import processing.core.PApplet;

public class Loops extends PApplet
{	
    float centerX;
    float centerY;

	public void settings()
	{
		size(500, 500);
	}// END settings()

	public void setup() 
	{
        colorMode(HSB);
        background(255);
        this.centerX = width / 2;
        this.centerY = height / 2;
	}// END setup()

	
	public void keyPressed()
	{
		if (key == ' ')
		{
			
		}// END IF
	}// END keyPressed()


	public void draw()
	{
        int i;
        noStroke();
        fill(120, 120, 255);
        ellipse(this.centerX, this.centerY, 25, 25);

        for(i = 0; i < 360; i += 10)
        {
            stroke(0);
            translate(width / 2, height / 2);
            rotate(i);

            pushMatrix();
            rotate(i);
            line(-47, 0, 47, 0);
            popMatrix();
        }// END FOR
	}// END draw()

    public void spiral()
    {
        int rotation = 0;

        stroke(0);
        
        for (rotation = 0; rotation < 361; rotation++)
        {
            line (height / 2, width / 2, rotation, rotation);
        }// END FOR
    }// END spiral()

    public void old_draw()
    {
        /*
		background(0);
		stroke(255);
		line(10, 10, 100, 10);
		line(10, 20, 100, 20);
		line(10, 30, 100, 30);
		line(10, 40, 100, 40);
		for(int y = 10 ; y <= 40 ; y += 10)
		{
			line(200, y, 300, y);
		}// END FOR
		int yy = 10;
		while(yy <= 40)
		{
			line(300, yy, 400, yy);
			yy += 10;
		}// END WHILE
        */
   }// END old_draw()
}// END CLASS Loop
