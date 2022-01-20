import processing.core.PApplet;
public class Entirebox
{
    private static int x;
    private int y;
    private PApplet applet;
    private String text;
    private Box checkbox;

    public Entirebox(PApplet applet_, int numOfBox)
    {
        applet = applet_;
        x = 400;
        y = (numOfBox * 85) + 110;
        text = "";
        checkbox = new Box(applet_, numOfBox);
    }


    public void display()
    {
        applet.stroke(255);
        applet.fill(255);
        applet.rect(x, y, 290, 80, 7);
    }

    public void type(char word)
    {
        text += word;
    }
    public String getText()
    {
        return text;
    }

    public int location()
    {
        return y;
    }

    public Box getBox()
    {
        return checkbox;
    }

    public void moveBox()
    {
        y -= 85;

    }


}
