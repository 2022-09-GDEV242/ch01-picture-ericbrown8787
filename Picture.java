/**
 * Picture Description: On the night of the full moon, a mighty wizard uses his wand to conjure his pointy hat
 * and mystical scrying orb from his coffee table offscreen. 
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
    
    //setting variables for colors for easily coloring multiple shapes that form a larger element
    private String robeColor;
    private String glowColor;
    private String wandColor;
    private String orbColor;
    private String orbOutlineColor;
    
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
        
        hat = new Triangle();  
        wand = new Triangle();
        orb = new Circle();
        
        orbOutline = new Circle();
        
        robeColor = "purple";
        glowColor = "yellow";
        wandColor = "rust";
        orbColor = "seafoam";
        orbOutlineColor = "white";
        
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            
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
            hat.moveVertical(-300);
            hat.makeVisible();
            
            wand.changeSize(120,15);
            wand.moveVertical(0);
            wand.moveHorizontal(-90);
            wand.changeColor(wandColor);
            wand.makeVisible();
            
            glow.changeColor(glowColor);
            glow.changeSize(30);
            glow.moveHorizontal(-90);
            glow.moveVertical(-150);
            glow.makeVisible();

            orbOutline.changeColor(orbOutlineColor);
            orbOutline.moveVertical(210);
            orbOutline.changeSize(94);
            orbOutline.makeVisible();
            
            orb.changeColor(orbColor);
            orb.moveVertical(210);
            orb.changeSize(90);
            orb.makeVisible();
            
            glow.slowMoveVertical(150);
            hat.slowMoveVertical(150);
            
            //Alternates slowMove animations to create flicker effect and move outline with orb
            for (int i = 0; i < 110; i++){
                orbOutline.slowMoveVertical(-1);
                orb.slowMoveVertical(-1);
            }
            
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        robe.changeColor("black");
        sleeve.changeColor("black");
        wand.changeColor("black");
        glow.changeColor("black");
        hat.changeColor("black");
        orbOutline.changeColor("black");
        orb.changeColor("white");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        robe.changeColor(robeColor);
        sleeve.changeColor(robeColor);
        wand.changeColor(wandColor);
        glow.changeColor(glowColor);
        hat.changeColor(robeColor);
        orbOutline.changeColor(orbOutlineColor);
        orb.changeColor(orbColor);
    }
}
