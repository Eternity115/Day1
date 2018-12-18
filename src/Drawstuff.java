import hsa.*;
import java.awt.Color;
public class Drawstuff {

    
    public static void main(String[] args) {
        Console c = new Console(15,100);
        //size is by 15 enters and 100 characters
        c.setColor(Color.red);
        c.drawLine(10, 10, 300, 50);
        //x1,y1, x2,y2 //0,0 is top left corner
        //Draw is in pixels
        c.setColor(new Color (255,120,70));
        c.drawRect(400, 50, 50, 200);
        //top left x-y, w-h
        c.fillRect(50, 200, 200, 100);
        c.setColor(Color.yellow);
        c.fillOval(500, 50, 100, 30);
        //top left corner x-y, w-h
        c.drawOval(50, 200, 50, 50); //circle
        //ask user for custom rectangle
        int x,y,w,h;
        c.print("X loc: ");
        x=c.readInt();
        c.print("Y loc: ");
        y=c.readInt();
        c.print("Width: ");
        w=c.readInt();
        c.print("Height: ");
        h=c.readInt();
        c.setColor(Color.red);
        c.clear(); //clears screen
        c.fillRect(x, y, w, h);
    }
    
}
