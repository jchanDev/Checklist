import processing.core.PApplet;

public class Box
{
    private PApplet applet;
    private int color;
    private static int x;
    private int y;
    protected static int tasksLeft;


    public Box(PApplet applet_, int numOfBox)
    {
        applet = applet_;
        x = 420;
        y = (numOfBox * 85) + 110;
        color = 255;
        tasksLeft++;
    }

    public void display()
    {
        applet.stroke(0);
        applet.fill(color);
        applet.rect(x, y + 35, 10, 10);
    }

    public boolean checked()
    {
        if (color == 0)
        {
            return true;
        }
        else
        {
            color = 0;
            tasksLeft--;
            return false;
        }
    }

    public void moveBox()
    {
        y -= 85;

    }


    public static int getTasksLeft()
    {
        return tasksLeft;
    }

}
