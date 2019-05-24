
package GuiOFBCLC;

import com.jtattoo.plaf.graphite.GraphiteLookAndFeel;
import java.awt.GradientPaint;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;



public class Main
{
    public static void main(String[] args)
    {
        try 
        {
           UIManager.setLookAndFeel(new GraphiteLookAndFeel());
           StartPoint startPoint=new StartPoint();
           startPoint.setVisible(true);
        } 
        catch (UnsupportedLookAndFeelException ex)
        {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
}
