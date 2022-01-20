
import processing.core.PApplet;

import java.util.*;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Checklist extends PApplet
{
    private AddCirc addCirc;
    private ArrayList<Entirebox> checklists;
    private float mouseXLoc;
    private float mouseYLoc;
    private boolean noMoreSpace = false;

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
        checklists = new ArrayList<Entirebox>();
        addCirc = new AddCirc(this);
        mouseXLoc = 0;
        mouseYLoc = 0;
    }

    public void draw()
    {
        background(40, 40, 49);
        addCirc.display();
        String s = noMoreSpace(noMoreSpace);
        int numOfTasks = Box.getTasksLeft();
        textSize(30);
        textAlign(LEFT);
        text( new SimpleDateFormat("MM-dd-YYY").format(new Date()), 400, 90);
        text("Tasks left: " + numOfTasks, 100, 90);
        textSize(30);
        textAlign(LEFT);
        text("SimpleTodoList", 250, 50);
        textSize(20);
        text(s, 40, 200);



        for (int i = 0; i < checklists.size(); i++)
        {
            checklists.get(i).display();
            checklists.get(i).getBox().display();

        }
        for (int i = 0; i < checklists.size(); i++)
        {
            fill(0);
            textAlign(LEFT);
            textSize(15);
            text(checklists.get(i).getText(), 450, (checklists.get(i).location()) + 10, 230, 70);
        }
    }

    public void mouseClicked()
    {
        mouseXLoc = mouseX;
        mouseYLoc = mouseY;
        clicked();
    }

    public void clicked()
    {
        clickedCheck();
        if (checklists.size() < 7)
        {
            clickedPlus();
            noMoreSpace = false;
        }
        else
        {
            noMoreSpace = true;
        }

    }

    public void clickedCheck()
    {
        if (mouseX > 420 && mouseX < 430)
        {
            for (int i = 0; i < checklists.size(); i++)
            {
                if (mouseY > checklists.get(i).location() + 35 && mouseY < checklists.get(i).location() + 35 + 80)
                {
                    if (checklists.get(i).getBox().checked())
                    {
                        movedBoxes(i);
                        checklists.remove(i);
                    }
                }
            }
        }
    }

    public void clickedPlus()
    {
        if(Math.sqrt(Math.pow(649 - mouseX, 2) + Math.pow(70 - mouseY, 2)) <= 25)
        {
            checklists.add(new Entirebox(this, checklists.size()));
        }
    }


    public void movedBoxes(int i)
    {
        for (int count = i; count < checklists.size(); count++)
        {
            checklists.get(count).moveBox();
            checklists.get(count).getBox().moveBox();
        }
    }

    public String noMoreSpace(boolean noSpace)
    {
        if (noSpace)
        {
            return ("You can not create more boxes");
        }
        return("");
    }


    public void keyTyped()
    {
        if (mouseXLoc > 400 && mouseXLoc < 690)
        {

            for (int i = 0; i < checklists.size(); i++)
            {
                if (mouseYLoc > checklists.get(i).location() && mouseYLoc < checklists.get(i).location() + 80)
                {
                    (checklists.get(i)).type(key);
                }
            }
        }
    }


}




