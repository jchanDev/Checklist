/*import processing.core.PApplet;
import java.util.*;
import java.io.*;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Checklist2 extends PApplet
{
    private Box b;
    private AddCirc addCirc;
    //private int numOfBox = 0;
    private ArrayList<Entirebox> checklists;

    private Entirebox newList;

    private float x;
    private float y;
    private boolean display;
    private boolean isClicked;
    private int numTimesClicked;
    //private Entirebox box;

    public static void main(String[] args)
    {
        PApplet.main("Checklist");
    }

    public void settings()
    {
        size(700, 700);
    }

    public void setup()
    {
        numTimesClicked = 0;
        checklists = new ArrayList<Entirebox>();
        b = new Box(this);
        addCirc = new AddCirc(this);
        newList = new Entirebox(this);

        //box = new Entirebox(this);

    }

    public void draw()
    {

        background(40, 40, 49);
        addCirc.display();
        String s = new SimpleDateFormat("dd-MM-YYY").format(new Date());
        textSize(30);
        text(s, 400, 100 );
        fill(250, 250, 250);
        if (isClicked)
        {
            //checklists[numOfBox].display();
            numTimesClicked++;
            //for (int i = 0; i < numTimesClicked; i++)
            checklists.forEach(box -> box.display());
            //newList.display();
        }

    }

    public void mouseClicked()
    {
        if (mouseX > 550 && mouseX < 650)
        {
            if(mouseY < 650 && mouseY > 550)
            {
                isClicked = true;
                checklists.add(new Entirebox(this));
            }
        }
    }


}*/



