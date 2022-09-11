/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Eric Brown
 * @version 2022-09-11
 */
public class Picture
{   private Circle frame;
    private Square background;
    private Person wizard;
    private Circle leftEye;
    private Circle rightEye;
    private Triangle nose;
    
    private Triangle robe;
    private Square sleeve;
    private Circle glow;
    
    private Triangle hat;
    private Triangle wand;
    private Circle orb;
    private Circle orbOutline;
    
    private Square testSquare;
    
    private Circle testCircle;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {   
        frame = new Circle();
        background = new Square();
        
        wizard = new Person();
        rightEye = new Circle();
        leftEye = new Circle();
        nose = new Triangle();
        
        robe = new Triangle();
        sleeve = new Square();
        glow = new Circle();
        //wall = new Square();
        
        hat = new Triangle();  
        wand = new Triangle();
        orb = new Circle();
        
        orbOutline = new Circle();

        testSquare = new Square();
        testCircle = new Circle();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            String robeColor = "purple";
            
            background.changeSize(500);
            background.changeColor("black");
            background.makeVisible();
            
            frame.changeSize(400);
            frame.changeColor("white");
            frame.makeVisible();
            
            wizard.changeSize(350,175);
            wizard.moveVertical(40);
            wizard.makeVisible();
            
            leftEye.changeSize(20);
            leftEye.moveVertical(-15);
            leftEye.moveHorizontal(-20);
            leftEye.changeColor("white");
            leftEye.makeVisible();
            
            rightEye.changeSize(20);            
            rightEye.moveVertical(-15);
            rightEye.changeColor("white");
            rightEye.moveHorizontal(20);
            rightEye.makeVisible();
            
            
            nose.changeSize(20,10);
            nose.moveVertical(-10);
            nose.changeColor("white");
            nose.makeVisible();
            
            robe.changeSize(260, 230);
            robe.moveVertical(45);
            robe.changeColor(robeColor);
            robe.makeVisible();
            
            sleeve.changeSize(80);
            sleeve.moveVertical(80);
            sleeve.changeColor(robeColor);
            sleeve.makeVisible();

            hat.changeSize(120, 88);
            hat.changeColor(robeColor);
            hat.moveVertical(-150);
            hat.makeVisible();
            
            wand.changeSize(120,15);
            wand.moveVertical(0);
            wand.moveHorizontal(-90);
            wand.changeColor("rust");
            wand.makeVisible();
            
            glow.changeColor("yellow");
            glow.changeSize(30);
            glow.moveHorizontal(-90);
            glow.moveVertical(0);
            glow.makeVisible();

            orbOutline.changeColor("white");
            orbOutline.moveVertical(100);
            orbOutline.changeSize(94);
            orbOutline.makeVisible();
            
            orb.changeColor("seafoam");
            orb.moveVertical(100);
            orb.changeSize(90);
            orb.makeVisible();
            
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        hat.changeColor("black");
        orb.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {

        hat.changeColor("green");
        orb.changeColor("yellow");
    }
}
