package ie.tudublin;

import processing.core.PApplet;

public class Arrays extends PApplet
{
    float[] rainFall = {45, 37, 55, 27, 38, 50, 79, 48, 31, 100};
    String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Dec", "Oct", "Nov", "Dec"};

    public void settings()
    {
        size(500, 500);
    }

    public void setup() 
    {
        for (int i = 0; i < rainFall.length; i++)
        {
            //System.out.printf("%s - %f", months[i], rainFall[i]);
            println(months[i] + "\t" + rainFall[i]);
        }// END FOR

        for (float f:rainFall)
        {
            println(f);
        }// END FOR

        for (String m:months)
        {
            println(m);
        }// END FOR

        println("The month with the most rainfall was " + mostRainFall());
    }

    public String mostRainFall()
    {
        String mostMonth = "";
        float biggest = rainFall[0];
        int i;

        for (i = 0; i < rainFall.length - 1; i++)
        {
            if (biggest < rainFall[i + 1])
            {
                mostMonth = months[i];
            }// END IF
        }// END IF

        return mostMonth;
    }// END mostRainFall()

    float offset = 0;

    
    
    public void keyPressed()
    {
        if (key == ' ')
        {
            
        }
    }	


    public void draw()
    {	
        background(0);		
        colorMode(HSB);	
    }
}
