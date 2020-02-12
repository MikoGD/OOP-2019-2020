package ie.tudublin;

import processing.core.PApplet;

public class HelloProcessing extends PApplet
{	
    int length = 500;
    int width = 500;

	public void settings()
	{
		size(this.length, this.width);
        smooth(3);
	}// END settings()

	public void setup() {
        noStroke();
	}// END setup()

		
	int x = 0; // 4 bytes
	
	public void draw()
	{
        background(237, 25, 9);
        fill(238, 242, 10);
        ellipse(250, 300, 400, 400);
        noStroke();
        fill(5, 247, 239);
        triangle(60, 470, 250, 60, 440, 470);
        fill(200);
        ellipse(250, 250, 170, 100);
        fill(20);
        ellipse(250, 250, 65, 65);
        //drawTriangle((float)40, 20, (float)20, 80, (float)90, 80);
        //triangle(250, 100, 125, 400, 375, 400);
    }// END draw()
    
    private float getPercentageCoord(float percentage, float num)
    {
        return (float) (num / 100) * percentage;
    }// END getPercentageCoord()

    /*
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
    */
}// END CLASS HelloProcessing
