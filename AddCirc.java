import processing.core.PApplet;

public class AddCirc
{
    private PApplet applet;
    public AddCirc(PApplet applet_)
    {
        applet = applet_;
    }

    public void display()
    {
        applet.stroke(0);
        applet.fill(28, 230, 255);
        applet.ellipse(649, 70, 50, 50);
        applet.textSize(32);
        applet.fill(0);
        applet.textAlign(applet.CENTER);
        applet.text("+", 650, 80);
    }



}

