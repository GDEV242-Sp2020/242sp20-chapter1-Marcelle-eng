/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2016.02.29
 */
public class Picture
{
    private Square background;
    private Square floor;
    private Circle head;
    private Circle body;
    private Circle left_eye;
    private Circle right_eye;
    private Triangle button1;
    private Triangle button2;
    private Circle sun;
    private Person player1;
    private Person player2;
    private Triangle lglove1;
    private Triangle rglove1;
    private Triangle lglove2;
    private Triangle rglove2;
    private Circle cloudf1;
    private Circle clouds1;
    private Circle cloudt1;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        background = new Square();
        floor = new Square();
        head = new Circle();
        body = new Circle(); 
        left_eye = new Circle();
        right_eye = new Circle();
        button1 = new Triangle();
        button2 = new Triangle();
        sun = new Circle();
        player1 = new Person();
        player2 = new Person();
        lglove1 = new Triangle();
        rglove1 = new Triangle();
        lglove2 = new Triangle();
        rglove2 = new Triangle();
        cloudf1 = new Circle();
        clouds1 = new Circle();
        cloudt1  = new Circle();
       
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            background.changeColor("skyblue");
            background.moveHorizontal(-340);
            background.moveVertical(-500);
            background.changeSize(550);
            background. makeVisible();
            
            floor.changeColor("light gray");
            floor.moveHorizontal(-350);
            floor.moveVertical(43);
            floor.changeSize(550);
            floor. makeVisible();
            
            sun.changeColor("yellow");
            sun.moveHorizontal(170);
            sun.moveVertical(-50);
            sun.changeSize(90);
            sun.makeVisible();
            
            head.changeColor("white");
            head.moveHorizontal(-30);
            head.moveVertical(55);
            head.changeSize(65);
            head.makeVisible();
            
            left_eye.changeColor("black");
            left_eye.moveHorizontal(-8);
            left_eye.moveVertical(70);
            left_eye.changeSize(7);
            left_eye.slowMoveHorizontal(-6);
            left_eye.makeVisible();
            
            right_eye.changeColor("black");
            right_eye.moveHorizontal(-6);
            right_eye.moveVertical(70);
            right_eye.changeSize(7);
            right_eye.slowMoveHorizontal(15);
            right_eye.makeVisible();
           
            body.changeColor("white");
            body.moveHorizontal(-50);
            body.moveVertical(100);
            body.changeSize(110);
            body.makeVisible();
            
            button1.changeColor("black");
            button1.moveHorizontal(20);
            button1.moveVertical(70);
            button1.changeSize(13,13);
            button1.makeVisible();
            
            button2.changeColor("black");
            button2.moveHorizontal(20);
            button2.moveVertical(90);
            button2.changeSize(13,13);
            button2.makeVisible();
            
            player1.changeColor("black");
            player1.moveHorizontal(25);
            player1.moveVertical(-35);
            player1.changeSize(95,45);
            player1.makeVisible();
            
            player2.changeColor("black");
            player2.moveHorizontal(-110);
            player2.moveVertical(35);
            player2.changeSize(80,45);
            player2.makeVisible();
            
            rglove1.changeColor("green");
            rglove1.moveHorizontal(-18);
            rglove1.moveVertical(94);
            rglove1.changeSize(13,13);
            rglove1.makeVisible();
            
            lglove1.changeColor("green");
            lglove1.moveHorizontal(-63);
            lglove1.moveVertical(95);
            lglove1.changeSize(13,13);
            lglove1.makeVisible();
            
            lglove2.changeColor("magenta");
            lglove2.moveHorizontal(73);
            lglove2.moveVertical(28);
            lglove2.changeSize(13,13);
            lglove2.makeVisible();
            
            rglove2.changeColor("magenta");
            rglove2.moveHorizontal(118);
            rglove2.moveVertical(28);
            rglove2.changeSize(13,13);
            rglove2.makeVisible();
            
            cloudf1.changeColor("white");
            cloudf1.moveHorizontal(80);
            cloudf1.moveVertical(-60);
            cloudf1.changeSize(90);
            cloudf1.makeVisible();
            
            clouds1.changeColor("white");
            clouds1.moveHorizontal(50);
            clouds1.moveVertical(-60);
            clouds1.changeSize(90);
            clouds1.makeVisible();
            
            cloudt1.changeColor("white");
            cloudt1.moveHorizontal(130);
            cloudt1.moveVertical(-60);
            cloudt1.changeSize(90);
            cloudt1.makeVisible();
            
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        background.changeColor("light gray");
        floor.changeColor("white");
        sun.changeColor("black");
        head.changeColor("black");
        left_eye.changeColor("white");
        right_eye.changeColor("white");
        body.changeColor("black");
        button1.changeColor("white");
        button2.changeColor("white");
        player1.changeColor("black");
        player2.changeColor("black");
        lglove1.changeColor("black"); 
        rglove1.changeColor("black"); 
        lglove2.changeColor("black"); 
        rglove2.changeColor("black"); 
        cloudf1.changeColor("white"); 
        clouds1.changeColor("white"); 
        cloudt1.changeColor("white");  
        
    
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        background.changeColor("skyblue");
        floor.changeColor("light gray");
        sun.changeColor("orange");
        head.changeColor("white");
        left_eye.changeColor("black");
        right_eye.changeColor("black");
        body.changeColor("white");
        button1.changeColor("yellow");
        button2.changeColor("green");
        player1.changeColor("brown");
        player2.changeColor("brown");
        lglove1.changeColor("magenta"); 
        rglove1.changeColor("magenta"); 
        lglove2.changeColor("green"); 
        rglove2.changeColor("green"); 
        cloudf1.changeColor("white"); 
        clouds1.changeColor("white"); 
        cloudt1.changeColor("white"); 
    }
}
