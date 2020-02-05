package ie.tudublin;

public class Cat extends Animal
{
    private int numLives = 9;

    public void setNumLives(int lives)
    {
        this.numLives = lives;
    }
    public int getNumLives()
    {
        return numLives;
    }

    public void speak()
    {
        System.out.println("Meow!");
    }

    public void killCat()
    {
        if (this.numLives > 0)
        {
            this.numLives--;

            if (this.numLives != 0)
            {
                System.out.println("Ouch!\n");
            }
            else
            {
                System.out.println("Dead...\n");
            }// END INNER IF
        }// END IF
    }// END killCat()
}